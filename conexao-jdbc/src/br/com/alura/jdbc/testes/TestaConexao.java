package br.com.alura.jdbc.testes;

import java.sql.*;

public class TestaConexao {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sucos";
        String usuario = "root";
        String senha = "!Jch9z%yKYa8KA";

        try {
            //carregando o driver --somente necessário se não utilizar o jar do driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //criando a conexão
            Connection con = DriverManager.getConnection(url,usuario,senha);

            //criando statement - mais vulnerável ao declarar parâmetros, pois pode occorrer SqlInjection
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM tbcliente WHERE IDADE > 20";

            //retorno colocado num ResultSet que trata retornos de consultas, para iterar sobre o resultado
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                System.out.println("#" + rs.getString("NOME")
                + " #" + rs.getShort("IDADE"));
            }

            //mais seguro
            String sql2 = "INSERT INTO tabela_de_vendedores (Matricula, Data_Admissao, De_Ferias, Nome, Percentual_Comissao) VALUES (?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "00240");
            ps.setDate(2, Date.valueOf("2023-02-01"));
            ps.setBoolean(3, false);
            ps.setString(4, "Thiago Bevilacqua");
            ps.setFloat(5, 0.11f);

            ps.executeUpdate();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            while (generatedKeys.next()){
                System.out.println("Matrícula do novo vendedor cadastrado: " + generatedKeys.getString("Matricula"));
            }

            ResultSet resultSet = stmt.executeQuery("SELECT Matricula, Nome FROM tabela_de_vendedores");
            while (resultSet.next()) {
                System.out.println("Número: " + resultSet.getString("Matricula") + " , Nome: " + resultSet.getString(
                        "Nome"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }
}