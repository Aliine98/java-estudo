package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.funcionarios.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSalario(2000.00);
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());
    }
}
