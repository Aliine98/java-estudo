import teste.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setSalario(2000.00);
        System.out.println(f1.getSalario());
        System.out.println(f1.getBonificacao());
    }
}
