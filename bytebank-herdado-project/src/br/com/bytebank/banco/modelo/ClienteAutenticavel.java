package br.com.bytebank.banco.modelo;

public class ClienteAutenticavel implements Autenticavel {
    private MetodoAutenticador autenticador;

    public ClienteAutenticavel() {
        this.autenticador = new MetodoAutenticador();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
