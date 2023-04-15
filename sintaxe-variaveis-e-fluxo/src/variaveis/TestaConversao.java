package variaveis;

public class TestaConversao {
    public static void main(String[] args) {
        double salario =  1270.50; // double é 64 bits
        int valor = (int) salario; // int vai até 2 bilhões
        System.out.println(valor);
        long numeroGrande = 3434343444L; // long precisa de um "L" no final
    }
}
