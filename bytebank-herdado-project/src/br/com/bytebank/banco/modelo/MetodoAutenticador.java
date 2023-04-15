package br.com.bytebank.banco.modelo;

public class MetodoAutenticador {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
