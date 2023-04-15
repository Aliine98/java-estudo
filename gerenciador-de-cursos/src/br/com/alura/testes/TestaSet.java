package br.com.alura.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaSet {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Aline Bevilacqua");
        alunos.add("Aline Bevilacqua");
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Thiago Bevilacqua");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");

        System.out.println(alunos.contains("Paulo Silveira"));
        alunos.remove("Sergio Lopes"); //mais rápido do que na lista

        System.out.println(alunos.size());

        alunos.forEach(System.out::println);

        System.out.println(alunos);
    }
}
