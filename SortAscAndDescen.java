package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortAscAndDescen {
	public void sortArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			System.out.println("enter" + " " + i + " " + "Index of element");
			arr.add(sc.nextInt());
		}

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		int i = 0;
		for (Integer a : arr) {
			if (i % 2 == 0) {// 23 54 3
				even.add(a);
			}
			if (i % 2 != 0) {// 12 2
				odd.add(a);
			}
			i++;
		}
		Collections.sort(odd); // 2 12
		Collections.sort(even, Collections.reverseOrder());// 54 23 3
		int oddlen = odd.size();
		int evenlen = even.size();
		int length = oddlen > evenlen ? oddlen : evenlen;
		for (int j = 0; j < length; j++) {
			if (j < evenlen) {
				System.out.println(even.get(j));
			}
			if (j < oddlen) {
				System.out.println(odd.get(j));
			}
		}

	}

	public static void main(String[] args) {
		new SortAscAndDescen().sortArray();

	}

}
