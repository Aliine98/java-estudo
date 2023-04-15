package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;

public class TesteBiblioteca {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Conta cc = new ContaCorrente(111, 111, new Cliente());
        cc.deposita(200.0);
        System.out.println(cc.getSaldo());
    }
}