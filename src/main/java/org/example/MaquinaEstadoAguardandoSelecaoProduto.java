package org.example;
//
public class MaquinaEstadoAguardandoSelecaoProduto extends MaquinaEstado {

    private static MaquinaEstadoAguardandoSelecaoProduto instance = new MaquinaEstadoAguardandoSelecaoProduto();

    private MaquinaEstadoAguardandoSelecaoProduto() {
    }

    public static MaquinaEstadoAguardandoSelecaoProduto getInstance() {
        return instance;
    }

    @Override
    public boolean produtoDisponivel(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        return true;
    }
    @Override
    public boolean entrarManutencao(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        return true;
    }

    @Override
    public boolean aguardarMoeda(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        return true;
    }

    @Override
    public String getEstado() {
        return "Aguardando Seleção de Produto";
    }
}
