package assignment;

import java.util.Scanner;

public class Q3Reverse {
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = n;
		int rev = 0;
		try {                                       //exception handling:)                            
		while (sum > 0) {
			
			int rem = sum % 10;
			rev = (rev * 10) + rem;
			sum = sum / 10;
		}
			System.out.println(rev-n);
			}
		   catch (ArithmeticException e)
			{
				System.out.println(rev);
			}
		}
	

	public static void main(String[] args) {

		Q3Reverse q3 = new Q3Reverse();
		q3.reverse();
	}
}
