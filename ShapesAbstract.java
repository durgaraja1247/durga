package assignment;

import java.util.Scanner;

interface Shape {
	void trainglearea();

	void squarearea();
}

class Traingle implements Shape {
	public void trainglearea() {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int h = sc.nextInt();
		double area = 0.5 * b * h;
		System.out.println(area);

	}

	@Override
	public void squarearea() {
		// TODO Auto-generated method stub

	}
}

class Square extends Traingle {
	public void squarearea() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * b);

	}

}

public class ShapesAbstract {

	public static void main(String[] args) {

		Traingle s = new Square();
		s.trainglearea();
		s.squarearea();
	}

}
