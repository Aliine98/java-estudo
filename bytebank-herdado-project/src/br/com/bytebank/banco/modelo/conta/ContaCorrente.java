package br.com.bytebank.banco.modelo.conta;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void saca(double valor) throws SacaException {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente - " + super.toString();
    }
}
