public class TestaContaComExceptionChecked {
    /*
        Checked para quando precisa avisar que aquele método pode gerar uma exception, caso contrário
        usa-se unckeced(RuntimeException).
    */
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception ex) {
            System.out.println("Tratamento...");
        }
    }

    private static void metodo1() throws Exception {
        Conta c = new Conta();
        c.deposita(); //tem exception
    }
}
