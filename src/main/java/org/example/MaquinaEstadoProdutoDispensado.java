package org.example;

public class MaquinaEstadoProdutoDispensado extends MaquinaEstado {

    private static MaquinaEstadoProdutoDispensado instance = new MaquinaEstadoProdutoDispensado();

    private MaquinaEstadoProdutoDispensado() {}

    public static MaquinaEstadoProdutoDispensado getInstance() {
        return instance;
    }

    @Override
    public boolean inserirMoeda(Maquina maquina) {
        return false;
    }

    @Override
    public boolean selecionarProduto(Maquina maquina) {
        return false;
    }

    @Override
    public boolean dispensarProduto(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        return true;
    }

    @Override
    public boolean devolverMoeda(Maquina maquina) {
        return false;
    }

    @Override
    public String getEstado() {
        return "Produto Dispensado";
    }
}

