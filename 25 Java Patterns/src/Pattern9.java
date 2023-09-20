public class Pattern9 {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Alternate between printing 1 and 0 based on the row and column positions
                System.out.print((i + j) % 2 == 0 ? "1" : "0");
            }
            System.out.println();
        }
    }
}
