public class TestaSetEGet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        //conta.numero = 1337;
        //conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente aline = new Cliente();
        aline.setNome("Aline Bevilacqua");
        System.out.println(aline.getNome());

        conta.setTitular(aline);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("programadora");

        Conta conta2 = new Conta(1337, 24227);
        conta2.setTitular(new Cliente());
        conta2.getTitular().setNome("Aline2");
        System.out.println(conta2.getTitular().getNome());
        System.out.println(conta2.getTitular());
        System.out.println(conta.getTitular());
    }
}
