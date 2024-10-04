package br.edu.unisep.cxbank.model;

public abstract class Conta {
    protected String titular;
    protected Double saldo;

    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void sacar(Double valor);

    public void depositar(Double valor){
        saldo += valor;
        System.out.println(titular + "depositou" + valor +
                " - Saldo atual: " + saldo);
    }

    public void exibirSaldo(){
        System.out.println("Saldo de " + titular + ":" + saldo);
    }
}
