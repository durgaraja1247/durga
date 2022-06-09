package assignment;

import java.util.Scanner;
interface Table
{
	void mul();
	void sub();
}

public class MulSub implements Table
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	public void mul() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n %d * %d = %d", n, i, n * i);
		}

	}

	public void sub() {
		for (int i = 1; i <= 10; i++)

			System.out.printf("\n %d - %d = %d", n, i, n - i);
	}

	public static void main(String[] args) {
		MulSub m = new MulSub();
		m.mul();

		MulSub m1 = new MulSub();
		m.sub();

	}

}
