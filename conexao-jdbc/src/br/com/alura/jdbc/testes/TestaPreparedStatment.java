package br.com.alura.jdbc.testes;

import br.com.alura.jdbc.modelo.ConnectionFactory;

import java.sql.*;

public class TestaPreparedStatment {
    public static void main(String[] args) throws SQLException {
        //usar "PreparedStatment" evita "SqlInjecion"
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //try with resources fecha automaticamente a conexão dentro dos parenteses
        try(Connection con = connectionFactory.getConexao()) {
            con.setAutoCommit(false);

            try (PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS)) {
                adicionarVariavel("SmartTV", "45 polegadas", stm);
                adicionarVariavel("Radio", "Radio de bateria", stm);

                con.commit();

            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Rollback executado");
                con.rollback();
            }
        }
    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        /*if (nome.equals("Radio")) {
            throw new RuntimeException("Não foi possível adicionar o produto");
        }*/

        int linhasAlteradas = stm.executeUpdate();
        System.out.println("Linhas alteradas: " + linhasAlteradas);
        try(ResultSet generatedKeys = stm.getGeneratedKeys()) {
            while (generatedKeys.next()) {
                System.out.println("O id gerado foi: " + generatedKeys.getInt(1));
            }
        }
    }
}
