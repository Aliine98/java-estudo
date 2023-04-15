package br.com.alura.testes;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCursoComAlunos {
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

        System.out.println("Todos os alunos matriculados:");

        javaColecoes.getAlunos().forEach(System.out::println);

        //outras formas de iterar:
        /*for (Aluno aluno : javaColecoes.getAlunos()) {
            System.out.println(aluno);
        }*/

        /*Iterator<Aluno> iterador = javaColecoes.getAlunos().iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }*/

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        Aluno a4 = new Aluno("Aline Bevilacqua", 34672); //obj diferente, mas representa
                                                                              //o mesmo aluno, tem o mesmo hashcode
        System.out.println("e o a4?");
        System.out.println(javaColecoes.estaMatriculado(a4));
        System.out.println("a1 equals a4? " + a1.equals(a4));
    }
}
