package assignment;

import java.util.Scanner;

class EvenOd {
	Scanner a = new Scanner(System.in);

	void odd() {

		System.out.println("Enter a number : ");

	}
}

class Two extends EvenOd {
	public void even() {
		super.odd();
		int b = a.nextInt();
		if (b % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");

		}
	}
}

class EvenOdd {
	public static void main(String[] args) {

		Two t = new Two();
		t.even();

	}

}