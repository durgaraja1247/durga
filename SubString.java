package assignment;

import java.util.Scanner;

public class SubString {
	public void substr()
	{
	Scanner sc=new Scanner(System.in);
		String s=sc.next();
	String s1=sc.next();
	char[] arr=new char[s.length()];
	char[] arr1=new char[s1.length()];
	int i,j,f=0;
	{
	for(i=1;i<=arr.length;i++)
	{
		if(arr[i]==arr1[0])
		{
			f=i;
			for(j=1;j<=arr1.length;j++)
			{
				if(arr[++i]!=arr1[j])
					f=-1;
			}
		}
	}
	System.out.println(f);
	}}
	public static void main(String[] args) {
		new SubString().substr();
		
	}

}
