package br.com.bytebank.banco.modelo.funcionarios;

public class Programador extends Funcionario {
    @Override
    public double getBonificacao() {
        return 200.0;
    }
}
