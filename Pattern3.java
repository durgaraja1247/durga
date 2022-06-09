package assignment;

import java.util.Scanner;

public class Pattern3 {
	private void patt()// Encapsulation
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 3 || i == n - 1)
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


