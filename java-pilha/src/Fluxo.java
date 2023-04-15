public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception ex) { //catch genérico
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MyException("Deu errado.");
        /*throw new Exception(); para "Exception" é necessário colocar "throws Exception" no final
                                 da assinatura do método ou usar um try/catch.
                                 Exception é checked e RuntimeException é unchecked
        */
        //System.out.println("Fim do metodo2");
    }
}
