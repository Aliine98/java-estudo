package br.com.alura.jdbc.testes;

import br.com.alura.jdbc.modelo.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsert {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.getConexao();

        Statement stm = con.createStatement();

        stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')",
                Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()) {
            System.out.println("O id criado foi: " + rst.getInt(1));
        }
    }
}
