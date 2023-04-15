package br.com.bytebank.banco.modelo.funcionarios;

import br.com.bytebank.banco.modelo.Autenticavel;
import br.com.bytebank.banco.modelo.MetodoAutenticador;

public class Administrador extends Funcionario implements Autenticavel {
    private MetodoAutenticador autenticador;

    public Administrador() {
        this.autenticador = new MetodoAutenticador();
    }

    @Override
    public double getBonificacao() {
        return 50;
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
