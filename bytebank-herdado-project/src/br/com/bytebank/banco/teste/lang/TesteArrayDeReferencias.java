package br.com.bytebank.banco.teste.lang;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;
import br.com.bytebank.banco.modelo.funcionarios.Gerente;

import java.util.Arrays;

public class TesteArrayDeReferencias {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        contas[0] = new ContaCorrente(111,222, new Cliente("Aline"));
        contas[0].deposita(100.0);
        contas[1] = new ContaPoupanca(111,333, new Cliente("Thiago"));

        Conta[] contas2 = {contas[0], contas[1]};

        Arrays.stream(contas2).iterator().forEachRemaining(conta -> {
            conta.deposita(100.0);
            System.out.println("Saldo da conta de " + conta.getTitular().getNome() + ": " + conta.getSaldo());
        });

        Object[] referencias = {contas[0], contas[1], new Gerente()};
        System.out.println("referencias length: " + referencias.length);
        ContaPoupanca cp = (ContaPoupanca) referencias[1];

       /* System.out.println(contas[0]);
        System.out.println(contas[1]);*/

        ContaCorrente ref = (ContaCorrente) contas2[0];
        //System.out.println(contas[0].getValorImposto()); Se o array for do tipo "Conta" não compila
        System.out.println(ref.getValorImposto());
    }
}
