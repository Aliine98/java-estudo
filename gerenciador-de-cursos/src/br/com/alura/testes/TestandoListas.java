package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Comparator;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(aula1);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo com foreach da lista:");
            System.out.println(aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        //Collections.sort(aulas);
        aulas.sort(Comparator.naturalOrder());
        System.out.println("Depois do sort: " + aulas);
        System.out.println("Aula 1: " + aulas.get(0));
    }
}
