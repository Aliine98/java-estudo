package br.com.alura.modelo;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new TreeSet<>();//também há um LinkedHashSet que guarda a ordem q as ref foram add
                            //TreeSet organiza as ref segundo a "ordem natural" definida pela implementação
                            //da interface Comparable.
    private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas); //serve para não deixar as modificações serem feitas com essa
                                                   //ref e forçar a utilização do método, sendo agora uma referencia
                                                    // de leitura
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        /*int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;*/

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + " minutos]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(this.alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        if (!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException("Matricula não encontrada");
        return this.matriculaParaAluno.get(numero);
    }
}
