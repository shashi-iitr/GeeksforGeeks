// Search an element in a sorted and pivoted array

package Arrays;

public class SearchXInSortedArray {

	public static void main(String[] args){
		int []A={4,5,6,7,8,9,10,1,2,3};
		int n=A.length, x=3;
		int i=maxEleIndex(A, 0, n-1); 
		
		System.out.println("max ele @= "+i);
		
		int b=0;
		if(x>=A[0]){
			b=findNum(A, 0, i, x);
		} else if(x<A[0]){
			b=findNum(A, i+1, n-1, x);
		}
		System.out.println("x is at index= "+b);
	}
	
	
	static int maxEleIndex(int []A, int i, int n){
		int  mid=(i+n)/2;
		if(i<0 || n<0  || n<i){
			return -1;
		}
		
		if(A[mid]>=A[mid+1] && A[mid]>=A[mid-1]){
			return mid;
		}
		if(A[mid]<A[n]){
			return maxEleIndex(A, i, mid);
		} else if(A[mid]>A[n]){
			return maxEleIndex(A, mid, n);
		}
		return -1;
	}
	
	
	static int findNum(int []A, int i, int n, int x){
		int mid=(i+n)/2;
		if(i<0 || n<0 || n<i){
			return -1;
		}
		if(x==A[mid]){
			return mid;
		} else if(A[mid]>x){
			return findNum(A, i, mid-1, x);
		} else if(A[mid]<x){
			return findNum(A, mid+1, n, x);
		}
		return -1;
	}
}
