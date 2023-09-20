
public class Pattern1 {
	public static void rightTriangle(int n) {
		int i, j;
		for (i = 0; i <=n; i++) // Outer loop for the number of rows (n)
		{
			for (j = 2 * (n - i); j >= 0; j--) // Inner loop for spaces
			{
				System.out.print(" "); // Printing space
			}
			for (j = 0; j <= i; j++) // Inner loop for columns
			{
				System.out.print("* "); // Print star
			}
			System.out.println(); // Ending line after each row
		}
	}

	public static void main(String args[]) {
		int n = 5;
		rightTriangle(n);
	}
}
