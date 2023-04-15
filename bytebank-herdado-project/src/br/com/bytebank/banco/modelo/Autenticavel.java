package br.com.bytebank.banco.modelo;
// "interface": conjunto de métodos abstratos a serem implementados por outras classes.
public interface Autenticavel{

    void setSenha(int senha);

    boolean autentica(int senha);
}
