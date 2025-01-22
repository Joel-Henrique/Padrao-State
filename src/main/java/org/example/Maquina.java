package org.example;

public class Maquina {
    private MaquinaEstado estado;

    public Maquina() {
        this.estado = MaquinaEstadoAguardandoMoeda.getInstance();
    }

    public void setEstado(MaquinaEstado estado) {
        this.estado = estado;
    }

    public boolean inserirMoeda() {
        return estado.inserirMoeda(this);
    }

    public boolean selecionarProduto() {
        return estado.selecionarProduto(this);
    }

    public boolean dispensarProduto() {
        return estado.dispensarProduto(this);
    }

    public boolean devolverMoeda() {
        return estado.devolverMoeda(this);
    }
    public MaquinaEstado getEstadoAtual() {
        return estado;
    }
    public boolean entrarManutencao() {
        this.setEstado(MaquinaEstadoManutencao.getInstance());
        return true;
    }
    public boolean sairManutencao() {
        this.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        return true;
    }
}