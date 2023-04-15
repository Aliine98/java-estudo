package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<>();
        ContaCorrente cc = new ContaCorrente(111, 222, new Cliente("Aline"));
        ContaPoupanca cp = new ContaPoupanca(222,333, new Cliente("Thiago"));
        ContaPoupanca cp2 = new ContaPoupanca(222,333, new Cliente("Thiago"));
        lista.add(cc);
        lista.add(cp);

        boolean existe = lista.contains(cp2);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
            if(conta.equals(cp2)) {
                System.out.println("Já tenho esta conta");
            }
        }
    }
}
