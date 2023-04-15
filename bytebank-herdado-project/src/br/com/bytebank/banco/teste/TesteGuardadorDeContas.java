package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.GuardadorDeReferencias;
import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 222, new Cliente("Aline"));
        ContaPoupanca cp = new ContaPoupanca(222,333, new Cliente("Thiago"));
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();
        guardador.adiciona(cc);
        guardador.adiciona(cp);
        int tamanho = guardador.getQuantidadeDeReferencias();
        System.out.println(tamanho);
        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
