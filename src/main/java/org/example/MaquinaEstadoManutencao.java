package org.example;
//
public class MaquinaEstadoManutencao extends MaquinaEstado {

    private static MaquinaEstadoManutencao instance = new MaquinaEstadoManutencao();

    private MaquinaEstadoManutencao() {}

    public static MaquinaEstadoManutencao getInstance() {
        return instance;
    }
    public boolean aguardarMoeda(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        return true;
    }
    @Override
    public String getEstado() {
        return "Em Manutenção";
    }
}

