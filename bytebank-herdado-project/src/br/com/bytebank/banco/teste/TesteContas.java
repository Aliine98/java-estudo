package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;
import br.com.bytebank.banco.modelo.conta.SacaException;

public class TesteContas {
    public static void main(String[] args) {
        Cliente aline = new Cliente("Aline");

        Cliente thiago = new Cliente("Thiago");

        ContaCorrente cc = new ContaCorrente(111,111, aline);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222, thiago);
        cp.deposita(200.0);
        try {
            cc.transfere(10.0, cp);
        } catch (SacaException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
