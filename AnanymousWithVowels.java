package assignment;

import java.util.Scanner;

class Vowels {
	public void vc() {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		{
			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
				System.out.println("it is vowel");
			} else {
				System.out.println(("it is consonant"));
			}
		}
	}
}

public class AnanymousWithVowels {

	public static void main(String[] args) {
		Vowels v1 = new Vowels();
		Vowels v = new Vowels() {
			public void vc() {
				Scanner sc = new Scanner(System.in);
				char ch = sc.next().charAt(0);

				{
					if ((ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U')) {
						System.out.println("it is vowel");
					} else {
						System.out.println(("it is consonant"));
					}
				}

			}
		};
		v.vc();
	}
}
