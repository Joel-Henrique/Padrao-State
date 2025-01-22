package org.example;

public class MaquinaEstadoProdutoDisponivel extends MaquinaEstado {

    private static MaquinaEstadoProdutoDisponivel instance = new MaquinaEstadoProdutoDisponivel();

    private MaquinaEstadoProdutoDisponivel() {
    }

    public static MaquinaEstadoProdutoDisponivel getInstance() {
        return instance;
    }

    @Override
    public boolean inserirMoeda(Maquina maquina) {
        return false;
    }

    @Override
    public boolean selecionarProduto(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        return true;
    }

    @Override
    public boolean dispensarProduto(Maquina maquina) {
        return false;
    }

    @Override
    public boolean devolverMoeda(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        return true;
    }

    @Override
    public String getEstado() {
        return "Produto Disponível";
    }
}