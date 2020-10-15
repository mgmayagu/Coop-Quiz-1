package binarySearch;

public class BinarySearch {
	
	public static int binarySearchIterative(int A[], int length, int v) {
	   
		int low  = 0;
	    int high = length;
	    int mid;
	    
	    while (low < high) {
	    
	    	mid = (low + high) / 2;
	        
	    	if (A[mid] == v)
	    		return mid;
	        
	    	else if (A[mid] < v)
	            low = mid + 1;
	        
	    	else
	            high = mid;
	    }
	    return -1;
	}
	
	public static int binarySearchRecursive(int A[], int value, int low, int high) {
		
		if (low > high)
			return -1;
		
		int mid = (low + high) / 2;
		
		if (A[mid] < value)
			return binarySearchRecursive(A, value, mid + 1, high);
		
		else if (A[mid] > value)
			return binarySearchRecursive(A, value, low, mid - 1);
		
		else
			return mid;
	}
	
	public static void main(String[] args) {
	
		int[] A = {0,1,2,3,4,5,6,7,8,9,10};
		
		int indexI = binarySearchIterative(A, A.length, 10);
		
		if (indexI == -1)
			System.out.println("NIL");
		else 
			System.out.println(indexI);		
		
		int indexR = binarySearchRecursive(A, 10, 0, A.length);
		
		if (indexR == -1)
			System.out.println("NIL");
		else 
			System.out.println(indexR);	
	}

}
