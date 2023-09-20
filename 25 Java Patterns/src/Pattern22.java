import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		double x, y, m;
		double size;

		System.out.println("Enter the size");
		Scanner scanner = new Scanner(System.in);
		m = scanner.nextDouble();
		scanner.close();

		for (y = m; y >= -m; y--) {
			for (x = -m; x <= m; x++) {
				size = Math.abs(m / 5);

				if ((Math.abs(Math.abs(x) - y) < size && y > 0) || (Math.abs(x) <= m && Math.abs(x) >= m - size)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}