package assignment;

import java.util.Scanner;

public class Natural {
	int n;

	Natural()// Without Parameterized constructor
	{
		n = 5;
	}

	public void nature() {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		int largestdigit = 0;
		while (sum > 0) {
			int mod = sum % 10;
			if (largestdigit < mod) {
				largestdigit = mod;
			}
			sum = sum / 10;
		}
		System.out.println("largest digit is" + " " + largestdigit);

	}

	public static void main(String[] args) {

		Natural s = new Natural();
		s.nature();

	}

}
