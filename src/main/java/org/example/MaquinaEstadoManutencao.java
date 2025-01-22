package org.example;
public class MaquinaEstadoManutencao extends MaquinaEstado {

    private static MaquinaEstadoManutencao instance = new MaquinaEstadoManutencao();

    private MaquinaEstadoManutencao() {}

    public static MaquinaEstadoManutencao getInstance() {
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
        return false;
    }

    @Override
    public boolean devolverMoeda(Maquina maquina) {
        return false;
    }

    @Override
    public String getEstado() {
        return "Em Manutenção";
    }
}

