public class TestaConexao {
    public static void main(String[] args) {

        try (Conexao con = new Conexao()) {
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão.");
        }

        /*
          -----Jeito antigo abaixo-----

            Conexao con = null;
            try {
                con = new Conexao();
                con.leDados();
            } catch (IllegalStateException ex) {
                System.out.println("Deu erro na conexão.");
            } finally {
                if(con != null) {
                    con.close();
                }
            }
        */
    }
}
