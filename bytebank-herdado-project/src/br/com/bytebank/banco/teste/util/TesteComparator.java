package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteComparator {

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

        for (Conta conta : lista) {
            System.out.println(conta);
        }
        System.out.println("---------------");
        lista.sort(new NumeroDaContaComparator());
        //lista.sort(new NomeTitularDaContaComparator());
        //lista.sort(null); recebendo null o método sort utiliza a ordem natural
        //Collections.sort(lista, new NumeroDaContaComparator()); forma antiga
        //Collections.sort(lista); // Quando não há um "Comparator" ele usa a ordem natural, no caso da conta, é
        // preciso ser definido na classe, implementando a interface "Comparable"

        // >>> Collections.rotate(lista, 2); <<< roda o index de cada elemento na quantidade de posições
        // indicada no segundo parâmetro

        Collections.reverse(lista);

        //Collections.shuffle(lista);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta o1, Conta o2) {
        return Integer.compare(o1.getNumero(), o2.getNumero());

        //return o1.getNumero() - o2.getNumero();

        /*
        if(o1.getNumero() < o2.getNumero()) {
            return -1;
        }
        if(o1.getNumero() > o2.getNumero()) {
            return 1;
        }
        return 0;
        */
    }
}

class NomeTitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta o1, Conta o2) {
        return o1.getTitular().getNome().compareTo(o2.getTitular().getNome());
    }
}
