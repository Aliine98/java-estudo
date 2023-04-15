public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(50);
        System.out.println(conta.getSaldo());

        boolean conseguiuRetirar = conta.saca(20);
        System.out.println(conseguiuRetirar);
        System.out.println(conta.getSaldo());

        Conta conta2 = new Conta();
        conta2.titular = new Cliente();
        conta2.titular.nome = "Marcela";

        conta2.deposita(1000);

        if (conta2.transfere(3000, conta)) {
            System.out.println("Transferencia feita com sucesso");
            System.out.println(conta.getSaldo());
            System.out.println(conta2.getSaldo());
        } else {
            System.out.println("Faltou dinheiro");
        }

        Cliente aline = new Cliente();
        aline.nome = "Aline";
        aline.cpf = "11122233344";
        aline.profissao = "desenvolvedora";

        System.out.println(conta.titular);
        conta.titular = aline;
        System.out.println(aline);
        System.out.println(conta.titular);
    }
}
