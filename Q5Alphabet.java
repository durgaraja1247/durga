package assignment;

import java.util.Scanner;

public class Q5Alphabet {
	public  void alpha() {
		 Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
		int n = c - 96;
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				System.out.print(c);
			}
			c--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
       
		new Q5Alphabet().alpha();

	}
}
