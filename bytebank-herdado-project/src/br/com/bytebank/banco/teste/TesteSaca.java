package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.SacaException;

public class TesteSaca {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Aline");
        ContaCorrente cc = new ContaCorrente(111,111, cliente);
        cc.deposita(200.0);
        try {
            cc.saca(300.0);
        } catch (SacaException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println(cc.getSaldo());
    }
}
