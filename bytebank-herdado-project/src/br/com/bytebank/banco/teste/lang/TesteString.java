package br.com.bytebank.banco.teste.lang;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Alura"; //Object literal
        //String outro = new String("Alura");

        /*String outra = nome.replace("A", "a");

        System.out.println("nome: " + nome);

        System.out.println("outra: " + outra);

        char c = nome.charAt(3);
        System.out.println(c);

        int pos = nome.indexOf("ur");
        System.out.println(pos);

        System.out.println(nome.substring(1,4));
        System.out.println(nome.length());
        System.out.println(nome.contains("ra"));*/

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}
