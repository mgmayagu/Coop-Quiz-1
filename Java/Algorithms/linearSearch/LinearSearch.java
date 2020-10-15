package linearSearch;

public class LinearSearch {
	
	
	public static int linearSeach(int[] arr, int value) {
		for(int i = 0; i < arr.length ; ++i) {
			if(arr[i] == value )
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,2,4,6,1,3};
		int v = 1;
		
		if (linearSeach(arr, v) == -1)
			System.out.print("NIL");
		else 
			System.out.print(linearSeach(arr, v));
		
	}
}
