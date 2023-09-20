public class Pattern3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                System.out.print("  "); // Print blank space
            }
            System.out.println("*"); // Print Star and newline
        }
    }
}
