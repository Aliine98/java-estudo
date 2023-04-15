package br.com.bytebank.banco.teste.lang;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Aline");
        Object cc = new ContaCorrente(111,222,cliente);
        ContaPoupanca cp = new ContaPoupanca(222, 333, new Cliente("Thiago"));
        System.out.println(1);
        System.out.println("Teste");
        System.out.println(cc);
        System.out.println(cp);
        System.out.println(cliente);

        //print(cc);
        //print(true);
    }
    static void print() {}
    static void print(int n) {}
    static void print(boolean valor) {}
    static void print(Object referencia) {}

}
