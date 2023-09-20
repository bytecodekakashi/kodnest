
public class Pattern14 {
	public static void main(String[] args) {
		int size = 5;
		int alpha = 65;
		int num = 0;
		// upside pyramid
		for (int i = 1; i <= size; i++) {
			// printing spaces
			for (int j = size; j > i; j--) {
				System.out.print(" ");
			}
			// printing alphabets
			for (int k = 0; k < i * 2 - 1; k++) {
				if (k == 0 || k == 2 * i - 2) {
					System.out.print((char)(alpha+num++));
				} else {
					System.out.print(" ");
				}
			}
			// set the number to 0
			num = 0;
			System.out.println();
		}
		// downside triangle
		for (int i = 1; i < size; i++) {
			// printing spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// printing alphabets
			for (int k = (size - i) * 2 - 1; k >= 1; k--) {
				if (k == 1 || k == (size - i) * 2 - 1) {
					System.out.print((char)(alpha+num++));
				} else {
					System.out.print(" ");
				}
			}
			// set the number to 0
			num = 0;
			System.out.println();
		}
	}
}