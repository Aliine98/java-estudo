package br.com.alura.jdbc.testes;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemComCategorias {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = new ConnectionFactory().getConexao()) {
            CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
            List<Categoria> categorias = categoriaDAO.listarComProdutos();
            categorias.forEach(categoria -> {
                System.out.println(categoria.getNome());
                    for(Produto produto : categoria.getProdutos()) {
                        System.out.println("- " + produto.getNome());
                    }
            });
        }
    }
}
