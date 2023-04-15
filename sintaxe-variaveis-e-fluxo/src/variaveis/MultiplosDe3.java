package variaveis;

public class MultiplosDe3 {
    public static void main(String[] args) {
        for (int multiplo = 1; multiplo <= 100; multiplo++) {
            if (multiplo % 3 == 0) {
                System.out.println(multiplo);
            }
        }

        for (int multiplo = 3; multiplo <= 100; multiplo += 3) {
            System.out.println(multiplo);
        }
    }
}
