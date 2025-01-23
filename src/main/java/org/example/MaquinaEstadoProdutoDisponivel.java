package org.example;
//
public class MaquinaEstadoProdutoDisponivel extends MaquinaEstado {

    private static MaquinaEstadoProdutoDisponivel instance = new MaquinaEstadoProdutoDisponivel();

    private MaquinaEstadoProdutoDisponivel() {
    }

    public static MaquinaEstadoProdutoDisponivel getInstance() {
        return instance;
    }

    public boolean dispensarProduto(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        return true;
    }
    @Override
    public boolean entrarManutencao(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        return true;
    }
    @Override
    public String getEstado() {
        return "Produto Disponível";
    }
}