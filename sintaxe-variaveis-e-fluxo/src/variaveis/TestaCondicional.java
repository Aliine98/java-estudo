package variaveis;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 24;
        int quantidadePessoas = 1;
        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Voce não pode entrar");
        }
    }
}
