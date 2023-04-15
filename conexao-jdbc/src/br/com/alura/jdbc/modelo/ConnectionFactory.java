package br.com.alura.jdbc.modelo;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    public DataSource dataSource;
    public ConnectionFactory() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("!Jch9z%yKYa8KA");
        comboPooledDataSource.setMaxPoolSize(15);
        this.dataSource = comboPooledDataSource;
    }

    public Connection getConexao() throws SQLException {
        return this.dataSource.getConnection();
        //em vez de criar uma única conexão diretamente com o DriverManager, é criado um pool de conexões e o DataSource pega uma das conexões disponíveis quando é feito as requisições
        /*DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "!Jch9z%yKYa8KA");*/
    }
}
