package selectionSort;

public class SelectionSort {
	
	public static void selectionSort(int A[]) {
		
		for(int i = 0; i < A.length-1; i++) {
			//System.out.println(i);
			int min = i;
			for(int j = i+1; j < A.length; ++j) {
				if (A[j] < A[min])
					min = j;
			}
			int temp = A[i];
			A[i] = A[min];
			A[min] = temp;
		}
	}

	public static void main(String[] args) {
		
		int[] A = {5,2,4,6,1,3};
		
		selectionSort(A);
		
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i]);
		
	}
	
}
