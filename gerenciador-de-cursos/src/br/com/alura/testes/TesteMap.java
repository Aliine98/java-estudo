package br.com.alura.testes;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        //pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));

        pessoas.values().forEach(System.out::println);
        pessoas.keySet().forEach(System.out::println);
        
        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        });

        for (Map.Entry<Integer, String> associacao : pessoas.entrySet()) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}