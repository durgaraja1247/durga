ckage assignment;
public class MergeSortedArray {
	public static void mergearray() {
		int[] arr = { 2, 4, 5, 6, 1 };
		int[] arr1 = { 2, 3, 4, 5, 6, 7 };
		int len1 = arr.length;
		int len2 = arr1.length;
		int result[] = new int[len1 + len2];
		int i = 0;
		int j = 0;
		int k = 0;
//	for(i=0;i<len1;i++)
//	{
//		System.out.println(arr[i]);
//	}
//	System.out.println();
//	for(i=0;i<len2;i++)
//	{
//		System.out.println(arr1[i]);
//	}
		while (i < len1 && j < len2) {
			if (arr[i] < arr1[j] ) {

				result[k++] = arr[i++];

			} else {
				result[k++] = arr1[j++];
			}

		}
		while (i < len1) {
			result[k++] = arr[i++];
		}
		while (j < len2) {
			result[k++] = arr1[j++];
		}
		for (i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
//	Set<Integer> s=new LinkedHashSet<Integer>();
//	s.addAll(Arrays.asList(result));
//	

	}

	public static void main(String[] args) {

		MergeSortedArray.mergearray();

	}

}
