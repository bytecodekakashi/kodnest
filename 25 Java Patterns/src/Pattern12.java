
public class Pattern12 {
	public static void main(String[] args) {
		int n = 5;
		printPattern(n);
	}

	static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			// Print spaces before the characters
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Print the first half of the characters in each row
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print((char) ('A' + j - 1));
			}

			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			// Print spaces before the characters
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Print the first half of the characters in each row
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print((char) ('A' + j - 1));
			}

			System.out.println();
		}
	}
}
