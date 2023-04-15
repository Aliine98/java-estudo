package br.com.bytebank.banco.teste.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteIteratorESet {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        nomes.forEach(nome -> System.out.println(nome.length()));

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
