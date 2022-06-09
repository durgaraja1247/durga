package assignment;

import java.util.Scanner;

class star {
	Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
	
int patt() {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--)
				System.out.print(" ");
			{
				for (int k = 1; k <= i; k++)
					System.out.print("* ");
			}
			System.out.println();

		}

		return n;
	}
}

class Pattern2 extends star {
	@Override
	public int patt() {
		super.patt();

		int j;
		for (int i = n; i >= 1; i--) {
			for (j = 1; j <= n - i; j++)
				System.out.print(" ");
			{
				for (int k = 1; k <= 2 * i - 1; k++)
					System.out.print(i);
			}
			System.out.println();
		}
		return n;
	}
}

class Pattern1 {

	public static void main(String[] args) {
		Pattern2 pa = new Pattern2();
		pa.patt();

	}
}
