package br.com.alura.jdbc.testes;

import br.com.alura.jdbc.modelo.ConnectionFactory;

import java.sql.*;

public class TestaConexaoDBLojaVirtual {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.getConexao();

        PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE id > ?");
        stm.setInt(1,2);

        Integer resultado = stm.executeUpdate();
        System.out.println("Linhas alteradas: " + resultado);
        stm.close();

        PreparedStatement stmt = con.prepareStatement("SELECT * FROM PRODUTO");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("ID | NOME | DESCRICAO");
            System.out.println(rs.getInt("id") + " | " + rs.getString("nome") + " | " + rs.getString("descricao"));
        }

        stmt.close();
        rs.close();
        con.close();
    }
}
