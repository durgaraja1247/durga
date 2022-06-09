package assignment;

import java.util.Scanner;

public class LargestNos {
	private int a;
	private int b;
	private int c;
	LargestNos(int a,int b,int c)//Parameterised Constructor
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public  void largestnumbers() {

		{
			if ((a > b) && (a > c)) {
				System.out.println("a is greater");
			} else {
				if ((b > c) && (b > a)) {
					System.out.println("b is greater");
				} else {
					System.out.println("c is greater");
				}
			}
		}
	}

	/*public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}*/

	public static void main(String[] args) {
		LargestNos l=new LargestNos(3,5,2);
		l.largestnumbers();
	

	}

}
