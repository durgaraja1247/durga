package assignment;

import java.util.Scanner;

public class Vowel {
	enum vow {
		a, e, i, o, u,h;
	}

	public void vc() {
		vow[] c = vow.values();

		for (vow v : c)

			switch (v) {

			case a:
				System.out.println("It is vowel");
				break;
			case e:
				System.out.println("It is vowel");
				break;
			case i:
				System.out.println("It is vowel");
				break;
			case o:
				System.out.println("It is vowel");
				break;
			case u:
				System.out.println("It is vowel");
				break;
			default:
				System.out.println("It is Consonant");

			}
	}

	public static void main(String[] args) {

		Vowel v = new Vowel();
		v.vc();

	}

}
