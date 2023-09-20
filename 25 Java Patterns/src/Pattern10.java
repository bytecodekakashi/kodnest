
public class Pattern10 {
	public static void main(String[] args) {
		// size of the square
		int size = 5, alpha = 65;
		for (int i = 0; i < size; i++) {
			// print spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// print alphabets
			for (int k = 0; k < 2 * (size - i) - 1; k++) {
				System.out.print((char) (alpha + k));
			}
			System.out.println();
		}
	}
}