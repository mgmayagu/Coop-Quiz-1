public class InsertionSort {

	public static void nonDrecreasingOrder(int[] arr) {
		// non decreasing -> f(b)<=f(a) for all b>a

		// sorts the array using insertion-sort algorithm
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			// insert arr[j] into the sorted sequence arr[1...j-1]
			int i = j - 1;

			while (i > 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}

		// prints out sorted array
		System.out.println();
		for (int j = 1; j < arr.length; j++)
			System.out.print(arr[j]);
	}

	public static void nonIncreasingOrder(int[] arr) {
		// non increasing -> f(b)>=f(a) for all b>a

		// sorts the array using insertion-sort algorithm
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			// insert arr[j] into the sorted sequence arr[j-1...1]
			int i = j - 1;

			while (i > 0 && arr[i] < key) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		// prints out sorted array
		System.out.println();
		for (int j = 1; j < arr.length; j++)
			System.out.print(arr[j]);
	}

	public static void main(String[] args) {
		// array that will be sorted
		int[] arr = { 5, 2, 4, 6, 1, 3 };

		// prints out the array before it is sorted
		for (int j = 1; j < arr.length; j++)
			System.out.print(arr[j]);

		nonDrecreasingOrder(arr);
		nonIncreasingOrder(arr);

	}
}
