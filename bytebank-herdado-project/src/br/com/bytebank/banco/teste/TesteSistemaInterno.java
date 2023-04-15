package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ClienteAutenticavel;
import br.com.bytebank.banco.modelo.funcionarios.Administrador;
import br.com.bytebank.banco.modelo.funcionarios.Gerente;
import br.com.bytebank.banco.modelo.SistemaInterno;

public class TesteSistemaInterno {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        ClienteAutenticavel cliente = new ClienteAutenticavel();
        cliente.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);
    }
}
