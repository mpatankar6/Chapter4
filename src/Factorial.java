public class Factorial {

    private static long calcFactorial(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    private static double calcE() {
        double e = 1;
        double ediff = 1;
        int i = 1;
        while (ediff > 0.001) {
            double olde = e;
            e += (1.0 / calcFactorial(i));
            ediff = e - olde;
            i++;
        }

        return e;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(calcFactorial(i));
        }

        System.out.println(calcE());
    }
}
