import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		int i, j, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n");
		n = sc.nextInt(); // Input
		// Upper V pattern
		for (i = n; i >= 1; i--) {
			for (j = i; j < n; j++) {
				System.out.print(" "); // Print spaces
			}
			for (j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1)) // Logic for printing star
					System.out.print("*");
				else
					System.out.print(" "); // If logic fails, print space
			}
			System.out.println("");
		}
		// Lower Inverted V pattern
		for (i = 2; i <= n; i++) {
			for (j = i; j < n; j++) {
				System.out.print(" "); // Print spaces
			}
			for (j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1)) // Logic for printing star
					System.out.print("*");
				else
					System.out.print(" "); // If logic fails, print space
			}
			System.out.println("");
		}
	}
}

