public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(300);
        System.out.println("saldo da primeiraConta: " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segundaConta: " + segundaConta.getSaldo());

        segundaConta.deposita(100);
        System.out.println("saldo da segundaConta: " + segundaConta.getSaldo());
        System.out.println("saldo da primeiraConta: " + primeiraConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("são a mesma conta");
        }
    }
}
