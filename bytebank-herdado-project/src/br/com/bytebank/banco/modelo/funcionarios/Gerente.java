package br.com.bytebank.banco.modelo.funcionarios;

import br.com.bytebank.banco.modelo.Autenticavel;
import br.com.bytebank.banco.modelo.MetodoAutenticador;

public class Gerente extends Funcionario implements Autenticavel {
    private MetodoAutenticador autenticador;

    public Gerente() {
        this.autenticador = new MetodoAutenticador();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
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
