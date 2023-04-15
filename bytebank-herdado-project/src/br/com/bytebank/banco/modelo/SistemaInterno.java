package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.modelo.Autenticavel;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel a) {              //todas classes que implementarem a "interface"
        boolean autenticou = a.autentica(this.senha);    // "Autenticavel" poderão ser passados como
        if (autenticou) {                                // parâmetro para este método que recebe o
            System.out.println("Você pode entrar no sistema."); //tipo "Autenticavel"
        } else {
            System.out.println("Você não pode entrar no sistema.");
        }
    }
}
