public class Pattern17 {
	public static void main(String[] args) {
		int n = 4;

		// Upper half of the pattern
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (j < i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// Lower half of the pattern
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (j < i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
