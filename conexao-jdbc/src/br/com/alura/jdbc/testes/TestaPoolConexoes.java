package br.com.alura.jdbc.testes;

import br.com.alura.jdbc.modelo.ConnectionFactory;

import java.sql.SQLException;

public class TestaPoolConexoes {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        for (int i = 1; i <= 20; i++) {
            connectionFactory.getConexao();
            System.out.println("Conexão número: " + i);
        }
    }
}
