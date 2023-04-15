public class TestaConstrutor {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 24227);
        Conta conta3 = new Conta(1337, 24228);
        System.out.println(Conta.getTotal());

        Conta conta4 = new Conta(24229);
        System.out.println(conta4.getAgencia());
    }
}
