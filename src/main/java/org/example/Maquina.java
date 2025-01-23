package org.example;

public class Maquina {
    private MaquinaEstado estado;

    public Maquina() {
        this.estado = MaquinaEstadoAguardandoMoeda.getInstance();
    }

    public void setEstado(MaquinaEstado estado) {
        this.estado = estado;
    }
    public boolean selecionarProduto() {
        return estado.selecionarProduto(this);
    }

    public boolean dispensarProduto() {
        return estado.dispensarProduto(this);
    }
    public MaquinaEstado getEstadoAtual() {
        return estado;
    }
    public boolean entrarManutencao() {
        return estado.entrarManutencao(this);
    }
    public boolean produtoDisponivel() {
        return estado.produtoDisponivel(this);
    }
    public boolean aguardarMoeda() {
        return estado.aguardarMoeda(this);
    }
}