package state;
import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaquinaTest {
    Maquina maquina;

    @BeforeEach
    public void setUp() {
        maquina = new Maquina();
    }

    @Test
    public void deveInserirMoedaNoEstadoAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertTrue(maquina.inserirMoeda());
        assertEquals(MaquinaEstadoProdutoDisponivel.getInstance(), maquina.getEstadoAtual());
    }

    @Test
    public void naoDeveSelecionarProdutoNoEstadoAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertFalse(maquina.selecionarProduto());
    }

    @Test
    public void naoDeveDispensarProdutoNoEstadoAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertFalse(maquina.dispensarProduto());
    }

    @Test
    public void naoDeveDevolverMoedaNoEstadoAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertFalse(maquina.devolverMoeda());
    }

    // Estado: Produto Disponível

    @Test
    public void naoDeveInserirMoedaNoEstadoProdutoDisponivel() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertFalse(maquina.inserirMoeda());
    }

    @Test
    public void deveSelecionarProdutoNoEstadoProdutoDisponivel() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertTrue(maquina.selecionarProduto());
        assertEquals(MaquinaEstadoProdutoDispensado.getInstance(), maquina.getEstadoAtual());
    }

    @Test
    public void naoDeveDispensarProdutoNoEstadoProdutoDisponivel() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertFalse(maquina.dispensarProduto());
    }

    @Test
    public void deveDevolverMoedaNoEstadoProdutoDisponivel() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertTrue(maquina.devolverMoeda());
        assertEquals(MaquinaEstadoAguardandoMoeda.getInstance(), maquina.getEstadoAtual());
    }

    // Estado: Produto Dispensado

    @Test
    public void naoDeveInserirMoedaNoEstadoProdutoDispensado() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertFalse(maquina.inserirMoeda());
    }

    @Test
    public void naoDeveSelecionarProdutoNoEstadoProdutoDispensado() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertFalse(maquina.selecionarProduto());
    }

    @Test
    public void deveDispensarProdutoNoEstadoProdutoDispensado() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertTrue(maquina.dispensarProduto());
        assertEquals(MaquinaEstadoAguardandoMoeda.getInstance(), maquina.getEstadoAtual());
    }

    @Test
    public void naoDeveDevolverMoedaNoEstadoProdutoDispensado() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertFalse(maquina.devolverMoeda());
    }

    // Estado: Em Manutenção

    @Test
    public void deveEntrarEmManutencao() {
        assertTrue(maquina.entrarManutencao());
        assertEquals(MaquinaEstadoManutencao.getInstance(), maquina.getEstadoAtual());
    }

    @Test
    public void naoDeveInserirMoedaNoEstadoManutencao() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertFalse(maquina.inserirMoeda());
    }

    @Test
    public void naoDeveSelecionarProdutoNoEstadoManutencao() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertFalse(maquina.selecionarProduto());
    }

    @Test
    public void naoDeveDispensarProdutoNoEstadoManutencao() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertFalse(maquina.dispensarProduto());
    }

    @Test
    public void naoDeveDevolverMoedaNoEstadoManutencao() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertFalse(maquina.devolverMoeda());
    }

    @Test
    public void deveSairDaManutencao() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertTrue(maquina.sairManutencao());
        assertEquals(MaquinaEstadoAguardandoMoeda.getInstance(), maquina.getEstadoAtual());
    }
}
