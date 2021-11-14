public class WhileExercise {

    private static int addOdds(int n) {
        int oddSum = 0;
        while (n >= 1) {
            if (n % 2 != 0) {
                oddSum += n;
            }
            n -= 1;
        }
        return oddSum;
    }

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
        double rate = 0.013; //1.13%
        double startPop = 111.2;
        int years = 0;
        while (startPop < endPop) {
            startPop += (rate * startPop);
            years++;
        }
        return years;
    }

    private static void printSum(int n) {
        int sum = 0;
        while (n >= 1) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }

   private static boolean isPerfectSquare(int n) {
       int i = 1;
       int increment = 1;
       while (i <= n) {
           if (i == n) {
               return true;
           } else {
               increment += 2;
               i += (increment);
           }
       }
       return false;

   }

    public static void main(String[] args) {
        System.out.println("Add Odds:");
        System.out.println(addOdds(12));
        System.out.println(addOdds(21));
        System.out.println(addOdds(7));
        System.out.println("Sum Digits:");
        System.out.println(sumDigits(559));
        System.out.println(sumDigits(1089));
        System.out.println(sumDigits(32675));
        System.out.println("How Many Years:");
        System.out.println(howManyYears(120.0));
        System.out.println(howManyYears(150.0));
        System.out.println("Print Sum");
        printSum(6);
        printSum(8);
        printSum(15);
        System.out.println("Is Perfect Square");
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(49));
        System.out.println(isPerfectSquare(13));
        System.out.println(isPerfectSquare(154));
    }
}
