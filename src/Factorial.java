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

    private static double calcEX(int x) {
        double ex = 1;
        double ediff = 1;
        int i = 1;
        while (ediff > 0.001) {
            double olde = ex;
            ex += (Math.pow(x, i) / calcFactorial(i));
            ediff = ex - olde;
            i++;
        }
        return ex;
    }

    public static void main(String[] args) {
        System.out.println("Factorials 1-20:");
        for (int i = 1; i <= 20; i++) {
            System.out.println(calcFactorial(i));
        }
        System.out.println("Euler's number");
        System.out.printf("e is %2.3f \n", calcE());

        System.out.println("e^x 1-5:");
        for (int i = 0; i <= 5; i++) {
            System.out.println(calcEX(i));
        }
    }
}
