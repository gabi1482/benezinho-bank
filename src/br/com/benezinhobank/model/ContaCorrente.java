package br.com.benezinhobank.model;

import br.com.benezinhobank.pessoa.model.Pessoa;

public class ContaCorrente extends Conta{

    private double limite;


    public ContaCorrente() {
    }

    public ContaCorrente(Agencia agencia, Pessoa titular, double saldo, double limite) {
        super(agencia, titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
