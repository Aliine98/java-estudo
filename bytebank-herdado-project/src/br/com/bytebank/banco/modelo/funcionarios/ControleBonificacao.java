package br.com.bytebank.banco.modelo.funcionarios;

public class ControleBonificacao {
    private double somaBonificacao;
    public void registra(Funcionario f) { //Polimorfismo: métodos podem receber os tipos mais genéricos
                                                 //e também seus filhos;
                                                 // mesmo o parâmetro sendo do tipo "Funcionario",
        double bonificaccao = f.getBonificacao();  //o método acessado será o da classe que esta função recebe
        this.somaBonificacao += bonificaccao;      //em seu parâmetro.
    }                                            // A referência leva para o objeto criado, logo será o método
                                                 // deste que será executado; uma referência genérica que aponta
                                                 //para tipos diferentes
    public double getSomaBonificacao() {
        return somaBonificacao;
    }
}
