package assignment;

import java.util.Scanner;
class Reverse
{
	 public void reverse()//when using inheritance cant declare final in super class method
	{
		int rev=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
	}}
	 class ReverseStr extends Reverse {
	final public void reverse() {  //final keyword overriding
		super.reverse();
			String s = " I love india";
			String[] a = s.split(" ");
			for (int i = a.length-1; i >=0; i--) {
				System.out.print(a[i] + " ");
			}

		}}

public class ReverseNo {
	public static void main(String[] args) {
		ReverseStr r=new ReverseStr();
		r.reverse();
		
	}
		
	}


	 
