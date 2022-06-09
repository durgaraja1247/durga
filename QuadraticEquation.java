package assignment;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {
	private void quadra() {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double disc, root1, root2, real, img;
		{                   
			disc = b * b - 4 * a * c;
			if (disc > 0) {
				root1 = (-b + Math.sqrt(disc) / (2 * a));
				root2 = (-b - Math.sqrt(disc) / (2 * a));
				System.out.printf("%.2f,%.2f", root1, root2);
			} else if (disc == 0) {
				root1 = (-b) / (2 * a);
				System.out.printf("%.2f", root1);
			} else {
				img = (Math.sqrt(-disc)) / (2 * a);
				real = -b / (2 * a);
				System.out.printf("root1 : %.2f+%.2fi  root2 :  %.2f+%.2fi", real, img, real, img);
			}

		}
	}

	public static void main(String[] args) {

		new QuadraticEquation().quadra();

	}

}
