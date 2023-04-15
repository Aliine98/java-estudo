package br.com.bytebank.banco.modelo.conta;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    /*public void setNome(String nome) {
        this.nome = nome;
    }*/

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente - Nome: " + this.nome + ", Profissao: " + this.profissao;
    }
}
