public class Pattern8 {

    public static void main(String[] args) {
        int n = 10;
        printPascalTriangle(n);
    }

    static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1;

            // Print spaces to align the numbers
            for (int k = 0; k < n - i; k++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");

                // Calculate the next number based on the previous one
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
