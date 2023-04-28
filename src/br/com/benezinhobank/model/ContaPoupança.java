package br.com.benezinhobank.model;

import br.com.benezinhobank.pessoa.model.Pessoa;

public class ContaPoupança extends Conta {

    private int aniversario;


    public ContaPoupança() {
    }

    public ContaPoupança(Agencia agencia, Pessoa titular, double saldo, int aniversario) {
        super(agencia, titular, saldo);
        this.aniversario = aniversario;
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }
}
