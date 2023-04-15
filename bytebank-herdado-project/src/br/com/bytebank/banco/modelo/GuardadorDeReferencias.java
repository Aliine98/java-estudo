package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
    private Object[] referencias;
    private int espacoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
        this.espacoLivre = 0;
    }

    public void adiciona(Object referencia) {
        this.referencias[this.espacoLivre] = referencia;
        this.espacoLivre++;
    }

    public int getQuantidadeDeReferencias() {
        return this.espacoLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
