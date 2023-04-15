package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>(); //ArrayList tempo: 2959
                                                       //HashSet tempo: 43
        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto no add: " + tempoDeExecucao);

        inicio = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        fim = System.currentTimeMillis();

        tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto no contains: " + tempoDeExecucao);

    }

}
