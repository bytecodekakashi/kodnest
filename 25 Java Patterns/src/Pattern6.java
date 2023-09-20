public class Pattern6 {

    public static void main(String[] args) {
        int n = 5;
        pattern(n); // Pattern method call
    }

    static void pattern(int n) {
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" "); // Print Space
            }

            System.out.print("*"); // Print star

            for (j = 1; j < 2 * i; j++)
                System.out.print(" "); // Print space

            if (i > 0)
                System.out.print("*");

            System.out.println(); // Enter newline
        }

        for (i = n - 2; i >= 0; i--) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" "); // Print Space
            }

            System.out.print("*"); // Print star

            for (j = 1; j < 2 * i; j++)
                System.out.print(" "); // Print space

            if (i > 0)
                System.out.print("*");

            System.out.println(); // Enter newline
        }
    }
}
