package assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MergeSortedArray1 {
	public  void mergearray() {
		Integer[] arr = { 2, 4, 5, 6, 1, 2, 1 };
		Integer[] arr1 = { 2, 3, 4, 5, 6, 7, 7 };
		Set<Integer> s = new TreeSet<Integer>();
		s.addAll(Arrays.asList(arr));
		Set<Integer> s1 = new TreeSet<Integer>();
		s1.addAll(Arrays.asList(arr1));
		Set<Integer> merge = new TreeSet<Integer>();
		merge.addAll(s1);
		merge.addAll(s);

		System.out.println(merge);

	}

	public static void main(String[] args) {
		new MergeSortedArray1().mergearray();

	}

}
