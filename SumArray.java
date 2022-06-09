package assignment;

public class SumArray {
	public void sum() {
		int arr[] = { 1, 2, 1, 3, 4 };
		int sum = 0;
		{
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		SumArray sa = new SumArray();
		sa.sum();

	}

}
