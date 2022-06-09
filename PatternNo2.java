package assignment;

import java.util.Scanner;

public class PatternNo2 {
	public void pattern() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j, k, l;
		int num = n;
		for (i = n; i > 0; i--, num--) {
			for (j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= n; k++) {
				System.out.print(k);
			}
			for (l = n - 1; l >= num; l--) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new PatternNo2().pattern();

	}

}
