package state;
import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaquinaTest {
    private Maquina maquina;
    @BeforeEach
    void setUp() {
        maquina = new Maquina();
    }
    // Teste 1: Aguardando Moeda -> Aguardando Seleção de Produto
    @Test
    void testTransicaoDeAguardandoMoedaParaAguardandoSelecaoProduto() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertTrue(maquina.selecionarProduto());
    }

    // Teste 2: Aguardando Moeda -> Manutenção
    @Test
    void testTransicaoDeAguardandoMoedaParaManutencao() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertTrue(maquina.entrarManutencao());
    }

    // Teste 3: Aguardando Moeda -> Produto Dispensado
    @Test
    void testTransicaoDeAguardandoMoedaParaProdutoDispensado() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertFalse(maquina.dispensarProduto());
    }

    // Teste 4: Aguardando Moeda -> Produto Disponível
    @Test
    void testTransicaoDeAguardandoMoedaParaProdutoDisponivel() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertFalse(maquina.produtoDisponivel());
    }

    // Teste 5: Aguardando Seleção de Produto -> Produto Disponível
    @Test
    void testTransicaoDeAguardandoSelecaoProdutoParaProdutoDisponivel() {
        maquina.setEstado(MaquinaEstadoAguardandoSelecaoProduto.getInstance());
        assertTrue(maquina.produtoDisponivel());
    }

    // Teste 6: Aguardando Seleção de Produto -> Aguardando Moeda
    @Test
    void testTransicaoDeAguardandoSelecaoProdutoParaAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoAguardandoSelecaoProduto.getInstance());
        assertTrue(maquina.aguardarMoeda());
    }

    // Teste 7: Aguardando Seleção de Produto -> Manutenção
    @Test
    void testTransicaoDeAguardandoSelecaoProdutoParaManutencao() {
        maquina.setEstado(MaquinaEstadoAguardandoSelecaoProduto.getInstance());
        assertTrue(maquina.entrarManutencao());
    }

    // Teste 8: Aguardando Seleção de Produto -> Produto Dispensado
    @Test
    void testTransicaoDeAguardandoSelecaoProdutoParaProdutoDispensado() {
        maquina.setEstado(MaquinaEstadoAguardandoSelecaoProduto.getInstance());
        assertFalse(maquina.dispensarProduto());
    }

    // Teste 9: Produto Disponível -> Produto Dispensado
    @Test
    void testTransicaoDeProdutoDisponivelParaProdutoDispensado() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertTrue(maquina.dispensarProduto());
    }

    // Teste 10: Produto Disponível -> Manutenção
    @Test
    void testTransicaoDeProdutoDisponivelParaManutencao() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertTrue(maquina.entrarManutencao());
    }

    // Teste 11: Produto Disponível -> Aguardando Moeda
    @Test
    void testTransicaoDeProdutoDisponivelParaAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertFalse(maquina.aguardarMoeda());
    }

    // Teste 12: Produto Disponível -> Aguardando Seleção de Produto
    @Test
    void testTransicaoDeProdutoDisponivelParaSelecaoProduto() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertFalse(maquina.selecionarProduto());
    }

    // Teste 13: Produto Dispensado -> Aguardando Moeda
    @Test
    void testTransicaoDeProdutoDispensadoParaAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertTrue(maquina.aguardarMoeda());
    }

    // Teste 14: Produto Dispensado -> Manutenção
    @Test
    void testTransicaoDeProdutoDispensadoParaManutencao() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertTrue(maquina.entrarManutencao());
    }

    // Teste 15: Produto Dispensado -> Selecionar Produto
    @Test
    void testTransicaoDeProdutoDispensadoParaSelecionarProduto() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertFalse(maquina.selecionarProduto());
    }
    // Teste 16: Produto Dispensado -> Produto Disponivel
    @Test
    void testTransicaoDeProdutoDispensadoParaProdutoDisponivel() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertFalse(maquina.produtoDisponivel());
    }

    // Teste 17: Manutenção -> Aguardando Moeda
    @Test
    void testTransicaoDeManutencaoParaAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertTrue(maquina.aguardarMoeda());
    }

    // Teste 18: Manutenção -> Selecionar Produto
    @Test
    void testTransicaoDeManutencaoParaSelecionarProduto() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertFalse(maquina.selecionarProduto());
    }

    // Teste 19: Manutenção -> Produto Disponível
    @Test
    void testTransicaoDeManutencaoParaProdutoDisponivel() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertFalse(maquina.produtoDisponivel());
    }

    // Teste 20: Manutenção -> Dispensar Produto
    @Test
    void testTransicaoDeManutencaoParaDispensarProduto() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertFalse(maquina.dispensarProduto());
    }
}
