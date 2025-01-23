package org.example;

public class MaquinaEstadoAguardandoMoeda extends MaquinaEstado {

    private static MaquinaEstadoAguardandoMoeda instance = new MaquinaEstadoAguardandoMoeda();

    private MaquinaEstadoAguardandoMoeda() {}

    public static MaquinaEstadoAguardandoMoeda getInstance() {
        return instance;
    }

    @Override
    public boolean selecionarProduto(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoAguardandoSelecaoProduto.getInstance());
        return true;
    }
    public boolean entrarManutencao(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        return true;
    }
    @Override
    public String getEstado() {
        return "Aguardando Moeda";
    }
}