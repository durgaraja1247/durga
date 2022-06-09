package assignment;

import java.util.Scanner;

public class ConcentricCircle {
	private int x;
	private int y;

	ConcentricCircle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double calculateArea() {
		double pi = 3.14;
		double outer = pi * x * x;
		double inner = pi * y * y;
		return outer - inner;

	}

	public static void main(String[] args) {

		ConcentricCircle cc = new ConcentricCircle(2, 1);
		double a = cc.calculateArea();
		System.out.println(a);
	}

}
