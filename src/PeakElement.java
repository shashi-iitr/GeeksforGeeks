/*
  Find a peak element in it, An array element is peak if it is NOT smaller 
  than its neighbors.For corner elements, we need to consider only one neighbor
 */
public class PeakElement {

	public static void main(String[] args){
		int [] A={5, 4, 1, 2, 1, 0, 1, 4};
		int l=A.length;
		int i=0;
		peakElements(A, l);
		int c=peakElementRec(A,i,l);
		System.out.print(c+ " ");
	}
	
	static void peakElements(int [] A, int l){
		if(A[0]>=A[1])
			System.out.print(A[0]+" ");
		if(A[l-1]>=A[l-2])
			System.out.print(A[l-1]+" ");
		for(int i=1; i<l-2; i++){
			if(A[i]>=A[i-1] && A[i]>=A[i+1])
				System.out.print(A[i]+" ");
		}
	}
	
	
	static int peakElementRec(int []A, int i, int l){
		int mid=0;
		if(l%2!=0){
			mid=l/2;
		}
		if(A[mid]>=A[mid-1] && A[mid]>=A[mid+1])
			return A[mid];
		if(A[mid]<A[mid-1])
			return peakElementRec(A, i, mid-1);
		if(A[mid]<A[mid+1])
			return peakElementRec(A, mid+1, l);
		return 0;
	}
}
