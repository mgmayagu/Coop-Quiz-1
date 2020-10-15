package mergeSort;

public class Merge {
	/*
	 * MERGE procedure NOT using sentinels, instead stopping once either array L or
	 * R has had all its elements copied back to A and then copying the remainder of
	 * the other array back into A
	 */
	private static void merge(int A[], int p, int q, int r) {

		int i, j, k;
		// sizes for the sub-arryas
		int n1 = q - p + 1;
		int n2 = r - q;
		// new sub-arrays L and R
		int L[] = new int[n1];
		int R[] = new int[n2];
		/*Copy data to temp arrays*/
		for (i = 0; i < n1; i++)
			L[i] = A[p + i];

		for (j = 0; j < n2; j++)
			R[j] = A[q + j + 1];

		for (i = 0, j = 0, k = p; k <= r; k++) 
			if (i == n1)
				A[k] = R[j++];
			else if (j == n2)
				A[k] = L[i++];
			else if (L[i] <= R[j])
				A[k] = L[i++];
			else
				A[k] = R[j++];
	}

//	private static void merge_S(int A[], int p, int q, int r) {
//
//		int i, j, k;
//		 // Find sizes of two sub-arrays to be merged 
//		int n1 = q - p + 1;
//		int n2 = r - q;
//		// Create new sub-arrays L and R
//		int L[] = new int[n1 + 1];
//		int R[] = new int[n2 + 1];
//		/*Copy data to temp arrays*/
//		for (i = 0; i < n1; i++)
//			L[i] = A[p + i];
//		for (j = 0; j < n2; j++)
//			R[j] = A[q + j + 1];
//		
//		// Sentinel
//		L[n1] = Integer.MAX_VALUE;
//		R[n1] = Integer.MAX_VALUE;
//		
//		for(i = 0, j = 0, k = p; k <= r; k++)
//			if( L[i] < R[j]) {
//				A[k] = L[i];
//				i++;
//			} else { 
//				A[k] = R[j];
//				j++;
//			}
//	}

	public static void merge_sort(int A[], int p, int r) {
		/*
		 * if p < r, the the sub-array has at most one element,therefore its already
		 * sorted otherwise the divide step simple computes and index q that partions
		 * A[p...r] into two sub-arrays. A[p..q] containing Ceiling(n/2) and A[q+1..r]
		 * containing Floor(n/2) elements
		 */

		if (p < r) {
			int q = (p + r) / 2;
			merge_sort(A, p, q);
			merge_sort(A, q + 1, r);
			// calls merge procedure to merge in sorted order the sub-arrays
			merge(A, p, q, r);
		}
	}

//	public static void merge_sort_S(int A[], int p, int r) {
//		/*
//		 * if p < r, the the sub-array has at most one element,therefore its already
//		 * sorted otherwise the divide step simple computes and index q that partions
//		 * A[p...r] into two sub-arrays. A[p..q] containing Ceiling(n/2) and A[q+1..r]
//		 * containing Floor(n/2) elements
//		 */
//
//		if (p < r) {
//			int q = (p + r) / 2;
//			merge_sort(A, p, q);
//			merge_sort(A, q + 1, r);
//			// calls merge procedure to merge in sorted order the sub-arrays
//			merge_S(A, p, q, r);
//		}
//	}

	public static void main(String[] args) {
		// array to be sorted
		int A[] = { 2, 5, 2, 4, 7, 1, 3, 2, 6 };
		// print out the array to be sorted
		for (int i = 0; i < A.length; ++i)
			System.out.print(A[i] + " ");
		System.out.println();
		// calls MergeSort to sort the array
		merge_sort(A, 0, A.length - 1);
		// prints out the sorted array
		for (int i = 0; i < A.length; ++i)
			System.out.print(A[i] + " ");

//		merge_sort_S(A, 0, A.length - 1);
//		// prints out the sorted array
//		for (int i = 0; i < A.length; ++i)
//			System.out.print(A[i] + " ");
	}
}


/*
public static void merge(int[] array, int startIndex, int midpointIndex, int endIndex)
{
    int leftNumberOfElements = midpointIndex-startIndex+1;
    int rightNumberOfElements = endIndex-midpointIndex;

    int leftArray[] = new int[leftNumberOfElements+1];
    int rightArray[] = new int[rightNumberOfElements+1];
    int i,j,k;

    for(i=0; i< leftNumberOfElements; i++)
    {
        leftArray[i] = array[startIndex+i];
    }
    for(j=0; j< rightNumberOfElements; j++)
    {
        rightArray[j] = array[midpointIndex+j+1];
    }

    leftArray[leftNumberOfElements] = Integer.MAX_VALUE;
    rightArray[rightNumberOfElements] = Integer.MAX_VALUE;

    i = 0;
    j = 0;
    for(k = startIndex; k<= endIndex; k++)
    {

        if( leftArray[i]<=rightArray[j])
        {
            array[k] = leftArray[i];
            i = i+1;
        }
        else
        {
            array[k] = rightArray[j];
            j = j+1;

        }
    }
}
*/
