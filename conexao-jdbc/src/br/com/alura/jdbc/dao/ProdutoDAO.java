package br.com.alura.jdbc.dao;

import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO { //DAO: Data Access Object, ou seja, um objeto utilizado só para acessar dados.
    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(Produto produto) throws SQLException {
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES (?,?)";
        try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1,produto.getNome());
            pstm.setString(2,produto.getDescricao());
            pstm.executeUpdate();

            try(ResultSet rst = pstm.getGeneratedKeys()) {
                while (rst.next()) {
                    produto.setId(rst.getInt(1));
                }
            }
        }
    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM PRODUTO";
        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            try (ResultSet rst = pstm.executeQuery()) {
                while (rst.next()) {
                    Produto produto = new Produto(rst.getInt("ID"), rst.getString("NOME"), rst.getString("DESCRICAO"));
                    produtos.add(produto);
                }
            }
        }
        return produtos;
    }
}
