package assignment;

import java.util.Scanner;

class number {
	int pattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int l = i - 1; l > 0; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
		return n;

	}
}

class number1 extends number {
	public int pattern(int n) {

		int i, j, k, l;
		int num = n;
		for (i = n; i > 0; i--, num--) {
			for (j = 0; j < i-1; j++) {
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
		return n;
	}
}

class PatternNo1 {
	public static void main(String[] args) {

		number1 p = new number1();
		p.pattern(5);
		number p1 = new number();
		p1.pattern(5);

	}

}
