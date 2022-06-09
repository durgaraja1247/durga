package assignment;

import java.util.Scanner;

public class PrintAlpha {
	 void alpha() {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		for (int i = ch; i <= 'z'; i++) {
			System.out.println(ch++);
		}
	}

	public static void main(String[] args) {

		PrintAlpha p=new PrintAlpha();
		p.alpha();
	}

}
