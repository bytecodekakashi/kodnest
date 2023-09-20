
public class Pattern16 {
	public static void main(String[] args) {
		int n = 5;
		char ch = 'E';
		int num = 9;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i % 2 == 1) {
					System.out.print(ch + " ");
					ch--;
				} else {
					System.out.print(num + " ");
					num--;
				}
			}
			if (i % 2 == 1) {
				ch = 'E';
			} else {
				num = 9;
			}
			System.out.println();
		}
	}
}
