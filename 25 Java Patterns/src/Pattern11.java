
public class Pattern11 {
	// pyramid alphabet pattern
	public static void main(String[] args) {

		int size = 5, alpha = 65;
		for (int i = 0; i < size; i++) {
			// print spaces
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			// print alphabets
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print((char)(alpha+k));
			}
			System.out.println();
		}
	}
}