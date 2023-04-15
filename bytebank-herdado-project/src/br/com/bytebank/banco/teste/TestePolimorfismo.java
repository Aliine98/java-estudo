package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.funcionarios.ControleBonificacao;
import br.com.bytebank.banco.modelo.funcionarios.Gerente;
import br.com.bytebank.banco.modelo.funcionarios.Programador;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Aline");
        g1.setSalario(5000.00);

        Programador p1 = new Programador();
        p1.setSalario(2000.00);

        Programador p2 = new Programador();
        p1.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(p1);
        controle.registra(p2);

        System.out.println(controle.getSomaBonificacao());
    }
}
