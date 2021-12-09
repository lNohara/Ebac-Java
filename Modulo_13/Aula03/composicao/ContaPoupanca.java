package Modulo_13.Aula03.composicao;

import jdk.nashorn.internal.ir.BaseNode;

public class ContaPoupanca {

    private Banco banco;
    private Double saldo;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
