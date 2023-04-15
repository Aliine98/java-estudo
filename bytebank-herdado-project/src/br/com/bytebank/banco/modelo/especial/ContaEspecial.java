package br.com.bytebank.banco.modelo.especial;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.SacaException;
import org.jetbrains.annotations.NotNull;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero, @NotNull Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void saca(double valor) throws SacaException {
        super.saldo = 1; /* "public": visível em todos lugares, mesmo em pacotes diferentes;
                            "private": visível apenas em sua própria classe;
                            "protected": visível para os filhos, mesemo de pacotes diferentes;
                            se não colocar marcador de visibilidade será visivel apenas no mesmo pacote.
        */
    }
}
