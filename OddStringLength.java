package assignment;

import java.util.Scanner;

public class OddStringLength {
	private void strlen()//Encapsulation
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i = 0,j = 0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
		
		if((i==j) || (i+j==n+1))
				
			System.out.print(i);
				
		else
		
			System.out.print(" ");
		}
				System.out.println();
	}}

	public static void main(String[] args) {
		
		
		new OddStringLength().strlen();

	}

}
