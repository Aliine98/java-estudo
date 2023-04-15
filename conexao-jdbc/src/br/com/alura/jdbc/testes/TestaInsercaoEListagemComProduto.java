package br.com.alura.jdbc.testes;

import br.com.alura.jdbc.modelo.ConnectionFactory;
import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

import java.sql.*;
import java.util.List;

public class TestaInsercaoEListagemComProduto {
    public static void main(String[] args) {
        Produto comoda = new Produto("Cômoda", "Cômoda vertical");
        try(Connection connection = new ConnectionFactory().getConexao()) {
            ProdutoDAO produtoDAO = new ProdutoDAO(connection);
            produtoDAO.inserir(comoda);
            List<Produto> produtos = produtoDAO.listar();
            produtos.forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
