package teste;

public class TestePolimorfismo {
    public String polimorfismo(Funcionario polimorfo) {
        if(polimorfo.testa()) {
            return "deu certo";
        }
        return "deu errado";
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();
        Funcionario g2 = new Gerente();
        Diretor d1 = new Diretor();
        TestePolimorfismo teste = new TestePolimorfismo();
        System.out.println(teste.polimorfismo(f1));
        System.out.println(teste.polimorfismo(g1));
        System.out.println(teste.polimorfismo(g2));
        System.out.println(teste.polimorfismo(d1));
    }
}
