package assignment;

import java.util.Scanner;

public class SwapTwoNos {
	 void swap() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;

		System.out.printf("After Swapping :- \na : %d \nb : %d", a, b);
	}

	public static void main(String[] args) {
		SwapTwoNos sw=new SwapTwoNos();
		sw.swap();
		

	}

}
