package assignment;

import java.util.Scanner;

interface Alphabet {
	public void alpha();

}

class Alphabets implements Alphabet
{
	@Override
	public void alpha() {
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("It is Alphabet");
		}
		else
		{
			System.out.println("It is consonant");
		}
	}
}

public class Alphabet2 {
	public static void main(String[] args) {
		Alphabets a=new Alphabets();

		Alphabet al = new Alphabet() {//Interface object creation
			public void alpha() {
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
		};
		al.alpha();
		a.alpha();

	}
}
