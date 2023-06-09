package br.com.alura.testes;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 19));
        javaColecoes.adiciona(new Aula("Relacionamentos com coleções", 23));

        Aluno a1 = new Aluno("Aline Bevilacqua", 34672);
        Aluno a2 = new Aluno("Guilerme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        //basicamente isso pode ser lido como: Curso, qual é o aluno com matricula número tal.
        Aluno aluno = javaColecoes.buscaMatriculado(5619);
        System.out.println(aluno);
    }
}
