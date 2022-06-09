package assignment;

class Expression {
	public void exp() {
		int a = 28;
		int b = a + (a++) + (++a) + (--a) + (a--);
		System.out.println("a + (a++) + (++a) + (--a) + (a--) : "+b);
	}
}

class Expression1 extends Expression {
	public void exp1() {
		super.exp();
		int x = 5;
		int x1 = (++x) - (x++) + (-x);
		System.out.println(" (++x) - (x++) + (-x) : "+x1);
	}
}

class Expression2 extends Expression1 {
	public void exp2() {
		int y = 10;
		int z = (++y * ((y++) + 5));
		System.out.println("(++y * ((y++) + 5)) : "+z);

	}
}

public class Expressions {
	public static void main(String[] args) {
		Expression1 e = new Expression1();
		e.exp1();
		Expression2 e1 = new Expression2();
		e1.exp2();
		
		

	}

}
