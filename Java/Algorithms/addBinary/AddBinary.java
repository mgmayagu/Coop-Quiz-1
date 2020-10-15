package addBinary;

public class AddBinary {
	
	public static void addBinary(int A[], int B[]) {
		
		int carry = 0;
		int n = A.length;

		int[] C = new int[n+1];
		
		for(int i = n-1; i >= 0; --i) {
			C[i+1] =(A[i] + B[i] + carry) % 2;
			carry = (A[i] + B[i] + carry) / 2;	
		}
		
		C[0] = carry;
		
		for (int i = 0; i < C.length; ++i)
			System.out.print(C[i]);
		
	}
	
	public static void main (String[] args) {
		
		int[] A = {0,1,0,0};
		int[] B = {1,0,0,0};
		
		addBinary(A, B);
	
	}

}
