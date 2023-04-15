package br.com.bytebank.banco.modelo.conta;

public class CalculadoraImpostos {
    private double somaImposto;

    public void registra(Tributavel t) {
        double imposto = t.getValorImposto();
        this.somaImposto += imposto;
    }

    public double getSomaImposto() {
        return somaImposto;
    }
}
