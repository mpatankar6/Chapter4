public class AdvancedForLoops {

    private static void eights() {
        int spaces = 0;
        int value = 8;
        for (int start = 8; start > 0; start -= 2) {
            for (int i = spaces; i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = start; j > 0; j--) {
                System.out.print(value);

            }
            spaces += 1;
            value -= 2;
            System.out.println("");
        }

    }

    private static void alternate(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                //EVEN
                for (int k = i; k >= 1; k--) {
                    System.out.print(k);
                }
            } else {
                //ODD
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }

    private static void isosceles(int n){
        int spaces = n;
        for (int i = 1; i <= n; i++){
            for(int j = 0; j < spaces - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    private static void upSideDown(int n1, int n2) {
        for (int i = 0; i <= (n1-n2); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = n1 - i; k >= n2; k--){
                System.out.print(k);
            }
            for(int l = n2 + 1; l <= n1 - i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        eights();
        alternate(6);
        alternate(5);
        isosceles(5);
        upSideDown(9, 5);
    }
}
