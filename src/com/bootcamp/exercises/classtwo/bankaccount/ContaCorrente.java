package com.bootcamp.exercises.classtwo.bankaccount;

import java.math.BigDecimal;

public class ContaCorrente {

    private int num;
    private double saldo;



    public ContaCorrente() {}
    public ContaCorrente(ContaCorrente contaCorrente) {

        if (contaCorrente != null) {
            saldo = contaCorrente.getSaldo();
            if (contaCorrente.getNum() != 0) {
                num = contaCorrente.getNum();
            }
        }
    }
    public ContaCorrente(int num, double saldo) {
        if (num != 0) {
            this.num = num;
        }
        this.saldo = saldo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void estorno(double valor) {
        saldo = saldo - valor;
    }

    public void transferir(ContaCorrente contaCorrente, double valor) {
        saldo = saldo - valor;
        contaCorrente.depositar(valor);
    }
}
