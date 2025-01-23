package org.example;
///
public class MaquinaEstadoProdutoDispensado extends MaquinaEstado {

    private static MaquinaEstadoProdutoDispensado instance = new MaquinaEstadoProdutoDispensado();

    private MaquinaEstadoProdutoDispensado() {}

    public static MaquinaEstadoProdutoDispensado getInstance() {
        return instance;
    }

    @Override
    public boolean aguardarMoeda(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        return true;
    }
    @Override
    public boolean entrarManutencao(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        return true;
    }
    @Override
    public String getEstado() {
        return "Produto Dispensado";
    }
}

