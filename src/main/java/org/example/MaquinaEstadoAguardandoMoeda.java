package org.example;

public class MaquinaEstadoAguardandoMoeda extends MaquinaEstado {

    private static MaquinaEstadoAguardandoMoeda instance = new MaquinaEstadoAguardandoMoeda();

    private MaquinaEstadoAguardandoMoeda() {}

    public static MaquinaEstadoAguardandoMoeda getInstance() {
        return instance;
    }

    @Override
    public boolean inserirMoeda(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        return true;
    }

    @Override
    public boolean selecionarProduto(Maquina maquina) {
        return false;
    }

    @Override
    public boolean dispensarProduto(Maquina maquina) {
        return false;
    }

    @Override
    public boolean devolverMoeda(Maquina maquina) {
        return false;
    }

    @Override
    public String getEstado() {
        return "Aguardando Moeda";
    }
}