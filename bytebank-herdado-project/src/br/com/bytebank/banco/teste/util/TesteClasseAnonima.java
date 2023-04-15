package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33, new Cliente("Aline"));
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44, new Cliente("Thiago"));
        cc2.deposita(111.0);

        Conta cc3 = new ContaCorrente(22, 11, new Cliente("João"));
        cc3.deposita(444.0);

        Conta cc4 = new ContaPoupanca(22, 22, new Cliente("Lucas"));
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        /*lista.sort(
            new Comparator<Conta>() { //cria uma classe anonima e instancia, assim utilizando o compare no sort
                @Override
                public int compare(Conta o1, Conta o2) {
                    return Integer.compare(o1.getNumero(), o2.getNumero());
                }
            }
        );*/

        //lambda
        lista.sort((o1, o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));

        lista.sort(Comparator.comparingInt(Conta::getNumero));

        lista.sort(
                (c1, c2) -> c1.getTitular().getNome().compareTo(c2.getTitular().getNome())
        );

        lista.sort(Comparator.comparing(c -> c.getTitular().getNome()));

        /*for (Conta conta : lista) {
            System.out.println(conta);
        }*/

        lista.forEach(conta -> System.out.println(conta + ", " + conta.getTitular().getNome()));

    }
}

