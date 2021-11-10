public class WhileExercise {

    private static int addOdds() {
        return 0;
    }

    //@TODO CHANGE TO A PRINT
    private static int sumDigits(int num) {
        int sum = 0;
        while (num >= 1) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // All numbers are in millions.
    private static int howManyYears(double endPop) {
        double rate = 1.0113;
        double startPop = 111.2;
        int years = 0;
        while (startPop < endPop) {
            startPop *= rate;
            years++;
        }
        return years;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(559));
        System.out.println(sumDigits(1089));
        System.out.println(sumDigits(32675));

        System.out.println(howManyYears(120.0));
        System.out.println(howManyYears(150.0));
    }
}
