package assignment;

import java.util.Scanner;

interface arr {
	void ArrayConcepts();
}

class ArrayCon implements arr {
	public void ArrayConcepts() {

		int con = 0;
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Duplication of array");
			System.out.println("2.To find even position in array");
			System.out.println("3.To find odd position in array");
			System.out.println(("4.Largest elements in array"));
			System.out.println("5.Smallest elements in array");
			System.out.println("6.Copy of one array into another array");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				int arr[] = { 1, 2, 3, 1, 4, 5, 6, 6, 5 };
				
				for (int i = 0; i < arr.length; i++) {
					
					for (int j = i+1; j < arr.length; j++) {
						if (arr[i] == arr[j])
							System.out.println(arr[j]);
					}
				}
			}

				break;
			case 2:
				
				int arr[] = { 1, 3, 5, 6, 8 };
				for (int i = 1; i < arr.length; i = i + 2) {
					// arr[i]=sc.nextInt();
					System.out.println(arr[i]);
				}
			case 3:
				int arr1[] = { 3, 5, 6, 2, 1 };
				for (int i = 0; i < arr1.length; i = i + 2) {
					System.out.println("Odd position of array=" + arr1[i]);
				}
			case 4:
				int arr2[] = new int[5];
				int max = arr2[0];
				for (int i = 0; i < arr2.length; i++) {
					arr2[i] = sc.nextInt();
					if (arr2[i] > max) {
						max = arr2[i];
					}
				}
				System.out.println("Largest element in array is=" + max);
			case 5:

				int arr3[] = new int [5];
				int min = 0;
				for(int i=0; i<arr3.length; i++) {
					arr3[i] = sc.nextInt();
				}
				min = arr3[0];
				for (int i = 0; i < arr3.length; i++) {
					if (arr3[i] < min) {
						min = arr3[i];
					}
				}
				System.out.println("Smallest element in array is=" + min);
				break;
			case 6:
				int i;
				int a[] = { 2, 4, 5, 6 };
				int[] a1 = new int[a.length];
				for (i = 0; i < a.length; i++) {
					a1[i] = a[i];
				}
				for (i = 0; i < a.length; i++) {

					System.out.println(a1[i]);
				}

			}

		} while (con == 1);
	}
}

public class Arrays {
	public static void main(String[] args) {
		ArrayCon arr = new ArrayCon();
		arr.ArrayConcepts();

	}

}
