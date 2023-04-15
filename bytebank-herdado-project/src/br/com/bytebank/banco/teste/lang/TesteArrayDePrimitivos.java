package br.com.bytebank.banco.teste.lang;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {

        int[] numeros = {2, 4, 6, 8, 10}; //Object literal de arrays, já inicializa com valores
        System.out.println(numeros[1]);
        int[] idades = new int[5]; //inicializa o array com os valores padrões
        /*idades[0] = 24;
        idades[1] = 14;
        idades[2] = 44;
        idades[3] = 34;
        idades[4] = 54;*/

        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }
        int idade1 = idades[0];

        for (int idade : idades) {
            System.out.println(idade);
        }

        System.out.println(idade1);

        System.out.println(idades.length);
    }
}
