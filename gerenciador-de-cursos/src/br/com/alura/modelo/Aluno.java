package br.com.alura.modelo;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int numeroMatricula;

    public Aluno(@NotNull String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return numeroMatricula == aluno.numeroMatricula && nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroMatricula);
    }

    @Override
    public int compareTo(@NotNull Aluno outro) {
        return this.nome.compareTo(outro.nome);
    }

    /*@Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }*/

    //É um número id do objeto. Cada "new Aluno" terá o hashcode de número correspondente ao retorno deste método.
    /*@Override
    public int hashCode() { // Quando sobreescreve o equals, deve-se sobreescrever o hashcode, pois se dois
                           //objetos são "equals" eles devem ter o mesmo hashcode.
        return this.nome.hashCode(); //usando a implementação da String, terá a separação dos obj baseada na string
        //do nome

        //return this.nome.charAt(0); hashcode de número correspondente a primeira letra do nome.
        //ou seja, cada aluno sera separado em espaços no set, pois se eles começam com a mesma letra terão o
        //mesmo hashcode, mas pode não ser bom pela primeira letra do nome, pois se tiver muitos alunos
        // no mesmo hashcode, o método contains irá demorar na busca.
    }*/
}
