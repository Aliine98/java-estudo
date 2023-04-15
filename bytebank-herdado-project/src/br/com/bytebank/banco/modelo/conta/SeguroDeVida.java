package br.com.bytebank.banco.modelo.conta;

public class SeguroDeVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 10.0;
    }
}
