//Find the minimum element in a sorted and rotated array

package Arrays;

public class MinInSortedRotatedArr {

	public static void main(String[] args){
		int []A={6,7,8,1,2,3,4,5};
		int l=A.length;
		int x=A[0];
		int b=minSortRotArr(A, 0, l-1, x);
		System.out.print(b);
	}
	
	static int minSortRotArr(int []A, int i, int l, int x){
		if(A[0]<A[l]){
			return A[0];
		} 
		if(A[l]<A[l-1]){
			return A[l];
		}
		int mid=(i+l)/2;
		if(i<0 || l<0 || l<i){
			return -1;
		}
		if(A[mid]<A[mid+1] && A[mid]<A[mid-1]){
			return A[mid];
		}
		if(A[mid]>x){
			return minSortRotArr(A, mid+1, l, x);
		} else if(A[mid]<x){
			return minSortRotArr(A, 0, mid-1, x);
		}
		return -1;
	}
}
