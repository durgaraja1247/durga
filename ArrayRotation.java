package assignment;

interface Rotation {
	void left();

	void right();

}

public class ArrayRotation implements Rotation {
	public void left() {

		{
			int arr[] = { 4, 5, 2, 1, 5 };
			int i, j, n = 1;
			{
				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
				}
				for (i = 0; i < n; i++) {
					int first = arr[0];
					for (j = 0; j < arr.length - 1; j++) {
						arr[j] = arr[j + 1];
					}
					arr[j] = first;
				}
				System.out.println("left rotation\n");
				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}
		}

	}

	public void right()

	{
		int arr[] = { 4, 5, 2, 1, 5 };
		int i, j, n = 1;
		{
			for (i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			for (i = 0; i < n; i++) {
				int last = arr[arr.length - 1];
				for (j = arr.length - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = last;
			}
			System.out.println("Right Rotation\n");
			for (i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		ArrayRotation ar = new ArrayRotation();
		ar.left();
		ar.right();
	}

}
