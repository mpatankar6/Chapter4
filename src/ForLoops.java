public class ForLoops {

    private static int addEvens(int n) {
        int evenSum = 0;
        for (int i = 0;  i <= n; i += 2) {
            evenSum += i;
        }
        return evenSum;
    }

    private static void printSquaresBack(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print((int) Math.pow(i, 2)+ ", ");
        }
        System.out.println(" ");
    }

    private static void sillyNumbers() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i);
            }
        }
        System.out.println(" ");
    }

    private static void sillyNumbers2() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
        System.out.println(" ");
    }

    private static void dollarsAndStars() {
        // Lines
        for (int i = 0; i >= 7; i++) {
            for (int j = 0; j <= i*2; j++) {
                System.out.print("*");
            }
            for (int k)
        }
    }

    public static void main(String[] args) {
        System.out.println(addEvens(10));
        System.out.println(addEvens(20));
        System.out.println(addEvens(56));
        printSquaresBack(10);
        sillyNumbers();
        sillyNumbers2();
    }
}
