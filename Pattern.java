package assignment;

import java.util.Scanner;

public class Pattern {
	public  void NumberPattern() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1, space;
		for (int i = 1; i <= n; i++) {
			for (space = 0; space < n - i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pattern p = new Pattern();

		p.NumberPattern();

	}
}
