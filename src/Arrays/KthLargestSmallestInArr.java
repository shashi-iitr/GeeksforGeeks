// k largest(or smallest) elements in an array

package Arrays;

public class KthLargestSmallestInArr {

	public static void main(String[] args){
		int []A={62,57,19,80,29,61,44,75,34};
		int k=4;
		int l=A.length;
		//kthSmallestEle(A, k, 0, l-1);
		System.out.println();
		kthLargestEle(A, k, 0, l-1);
	}
	
	static void kthLargestEle(int []A, int k, int low, int high){
		int l=A.length;
		int q=0;
		if(low<high){
			q=partition(A, low, high);
			if(q==high-k+1){
				System.out.print(A[q]);
			} else if(q>high-k+1){
				kthLargestEle(A, k, q+1, high);
			} else {
				kthLargestEle(A, k, low, q-1);
			}
		} else if(low==high){
			System.out.print(A[q]);
		}
		
	}
	
	static void kthSmallestEle(int []A, int k, int low, int high){
		int q=0;
		if(low<high){
			q=partition(A, low, high);
			
			if(q==k-1){
				System.out.print(A[q]);
			} else if(q>k-1){
				kthSmallestEle(A, k, low, q-1);
			} else if(k>q){
				kthSmallestEle(A, k, q+1, high);
			} 
		} else if(low==high){
			System.out.print(A[q]);
		}
	}
	
	static int partition(int []A, int low, int high){
		int x=A[low];
		int i=low, j=high;
		while(i<j){
			while(A[i]<x){
				i++;
			}
			while(A[j]>x){
				j--;
			}
			if(i<j){
				swap(A, i, j);
			}
		}
		
		return j;
	}
	
	
	static void swap(int []A, int i, int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
}
