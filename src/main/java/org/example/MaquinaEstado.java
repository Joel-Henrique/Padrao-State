package org.example;

public abstract class MaquinaEstado {
    public abstract boolean inserirMoeda(Maquina maquina);
    public abstract boolean selecionarProduto(Maquina maquina);
    public abstract boolean dispensarProduto(Maquina maquina);
    public abstract boolean devolverMoeda(Maquina maquina);
    public abstract String getEstado();
}