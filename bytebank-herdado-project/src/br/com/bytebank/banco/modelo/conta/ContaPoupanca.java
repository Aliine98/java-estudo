package br.com.bytebank.banco.modelo.conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public String toString() {
        return "ContaPoupanca - " + super.toString();
    }
}
