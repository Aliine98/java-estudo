package br.com.alura.testes;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        //List<Aula> aulas = javaColecoes.getAulas();
        //System.out.println(aulas);
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayLists", 21)); dessa forma não é possível ser
        //feito caso o getter devolva a referencia passada para Collections.unmodifiableList()

        //System.out.println(aulas);

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 19));
        javaColecoes.adiciona(new Aula("Relacionamentos com coleções", 23));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);
    }
}
