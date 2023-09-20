public class Pattern2 {
    public static void main(String args[]) {
        pyramidPattern();
    }

    public static void pyramidPattern() {
        int n = 5;
        for (int i = 0; i < n; i++) { // outer loop for the number of rows (n)
            for (int j = n - i; j > 1; j--) { // inner loop for spaces
                System.out.print(" "); // print space
            }
            for (int j = 0; j <= i; j++) { // inner loop for the number of columns
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }
    }
}
