package assignment;

import java.util.Scanner;

public class AsciiValue {

	void ascii() {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int a = ch;
		System.out.println(a);

	}

	public static void main(String[] args) {

		AsciiValue as = new AsciiValue();
		as.ascii();

	}

}
