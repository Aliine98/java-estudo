package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.conta.Cliente;
import br.com.bytebank.banco.modelo.conta.Conta;
import br.com.bytebank.banco.modelo.conta.ContaCorrente;
import br.com.bytebank.banco.modelo.conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteArrayList {
    public static void main(String[] args) {
        // <> : generics
        //ArrayList<Conta> lista = new ArrayList<>();
        //Vector<Conta> lista = new Vector<>();
        List<Conta> lista = new LinkedList<>();
        ContaCorrente cc = new ContaCorrente(111, 111, new Cliente("Aline"));
        ContaPoupanca cp = new ContaPoupanca(222,222, new Cliente("Thiago"));
        lista.add(cc);
        lista.add(cp);
        System.out.println("Tamanho: " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        lista.remove(1);
        System.out.println("Tamanho: " + lista.size());
        ContaCorrente cc2 = new ContaCorrente(111, 333, new Cliente("João"));
        ContaPoupanca cp2 = new ContaPoupanca(222,444, new Cliente("Lucas"));
        lista.add(cc2);
        lista.add(cp2);
        Conta ref2 = lista.get(2);
        System.out.println(ref2);
        /*for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }*/
        for(Conta conta : lista) {
            System.out.println(conta.getNumero());
        }

        /*
            (na dúvida escolha ArrayList)
            #ArrayList é mais otimizado para adicionar e iterar/acessar os itens; tem acesso direto a um
            item, por exemplo, na última posição, pode-se usar o index para acessá-lo diretamente.
            Porém, pior para remover itens, pois é preciso realocar todos os itens para uma posição antes.

            #LinkedList é mais otimizado para remover itens, já que somente muda a referência ao
            próximo e/ou último item.
            Porém, pior para iterar sobre os itens, já que é sempre preciso começar do primero item, não
            sendo possível acessar um item específico diretamente.

            #Vector é threadsafe, pode ser utilizado em várias pilhas diferentes em execução simultânea
            A mesma lista pode ser usada em várias pilhas. Tem um desempenho custoso, então somente usado
            em caso específico para multi-pilhas.
         */
    }
}
