package assignment;

import java.util.Scanner;

public class PatternSimple {
	void patt()// Encapsulation
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n; j++) {
				if (j == 1)
					System.out.print("*");
				if (i == n / 2 + 1)
					System.out.print("*");
				else
					System.out.print(" ");
				if (j == 4)
					System.out.print("*");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		PatternSimple p = new PatternSimple();
		p.patt();

	}

}
