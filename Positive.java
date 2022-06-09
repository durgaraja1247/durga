package assignment;

import java.util.Scanner;

public class Positive {
	public void pos() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("It is positive");
		} else {
			if (n < 0) {
				System.out.println("It is negative");
			} else {
				System.out.println("It is o");
			}

		}
	}

	public static void main(String[] args) {

		Positive p = new Positive();
		p.pos();
	}

}
