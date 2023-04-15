package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteAutoboxingEUnboxing {
    public static void main(String[] args) {
        //int[] numeros = new int[5]; array de primitivos
        //String[] nomes = new String[5]; array de refs

        int idade = 29; //há uma classe equivalente para os primitivos, neste caso, Integer.

        List<Integer> refs = new ArrayList<>(); //lista, que só guarda referências
        //Autoboxing:
        refs.add(idade);                          //não deveria funcionar, mas
        Integer idadeRef = Integer.valueOf(29);// por baixo dos panos o java faz isso, converte
                                                  //valor primitivo em ref, criando um objeto passando o valor
        refs.add(idadeRef);
        int idadeConvertida = idadeRef.intValue(); //unboxing
        System.out.println(idadeConvertida);
        String s = "10";
        Integer num = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.BYTES);
        Boolean bool = Boolean.TRUE;
        System.out.println(bool.booleanValue());
        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(11.1);   //polimorfismo com a classe Number
        lista.add(22.2f);

        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        /* Isso é o que acontece por baixo dos panos no código acima. Acontece um unboxing e autoboxing
        O valor é desembrulhado, depois incrementado e depois embrulhado de novo!

        int valor = ref.intValue();
        valor = valor + 1;
        ref = Integer.valueOf(valor);*/
    }
}
