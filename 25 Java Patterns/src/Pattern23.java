import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args) {
		double i, j, n;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size");
		n = s1.nextDouble();
		s1.close();
		for (j = n; j >= -n; j--) {
			for (i = -n; i <= n; i++) {
				if ((Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(n, 2) && Math.pow(i, 2) + Math.pow(j, 2) >= Math.pow(n - (n / 4), 2)
						&& !(Math.abs(j - (n / 4)) < n / 4 && i >= 0)) || (i > 0 && Math.abs(j + (n / 8)) <= n / 8)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}




