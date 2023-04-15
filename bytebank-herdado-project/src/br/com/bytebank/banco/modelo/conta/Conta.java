package br.com.bytebank.banco.modelo.conta;

import org.jetbrains.annotations.NotNull;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author Aline
 */

public abstract class Conta implements Comparable<Conta>{ //interface que permite definir ordem natural de sort
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero, @NotNull Cliente titular) {
        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
        Conta.total++;
        //System.out.println("Total de contas é " + br.com.bytebank.banco.modelo.conta.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        System.out.println("estou criando uma conta " + this.numero + " no nome de " +
                titular.getNome());
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    /**
     * Valor precisa ser maior que o saldo.
     *
     * @param valor
     * @throws SacaException
     */
    public void saca(double valor) throws SacaException {
        if(this.saldo < valor) {
            throw new SacaException("Saldo insuficiente: " + this.saldo + ", valor a sacar: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SacaException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

  /*  public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("não pode valores <= 0.");
            return;
        }
        this.numero = numero;
    }*/

    /*public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("não pode valores <= 0.");
            return;
        }
        this.agencia = agencia;
    }*/


    public int getAgencia() {
        return this.agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    //Comparable
    @Override
    public int compareTo(@NotNull Conta outra) { //método que define a ordem natural
        return Double.compare(this.saldo, outra.saldo);
    }

    //A classe do java.lang "Object" possui métodos feitos para serem reescritos para assim
    //ter um resultado mais expressivo e/ou ter suas próprias regras

    /**
     * Método para verificar se as referências representam a mesma conta.
     *
     * @param obj referência recebida para comparação
     * @return true caso a agência e o número sejam iguais em ambos objetos
     */

    @Override
    public boolean equals(Object obj) {
        Conta ref = (Conta) obj;
        return this.agencia == ref.agencia && this.numero == ref.numero;
    }

    /**
     * Método que retorna informações da conta.
     *
     * @return Número, agência e saldo da conta.
     */
    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
    }
}