package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.conta.CalculadoraImpostos;
import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.SeguroDeVida;

public class TesteCalculadorImposto {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Aline");
        ContaCorrente cc = new ContaCorrente(111,111, cliente);
        cc.deposita(550);
        SeguroDeVida sv = new SeguroDeVida();
        CalculadoraImpostos calculador = new CalculadoraImpostos();

        calculador.registra(cc);
        calculador.registra(sv);

        System.out.println(calculador.getSomaImposto());
    }
}
