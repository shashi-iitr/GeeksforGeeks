// k largest(or smallest) elements in an array

package Arrays;

public class KthLargestSmallestInArr {

	public static void main(String[] args){
		int []A={87,03,94,262,75,39,23,74,58,96,52};
		int k=4;
		int l=A.length;
		kthSmallestEle(A, k, 0, l-1);
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
			} else if(q<high-k+1){
				kthLargestEle(A, k, q+1, high);
			} else {
				kthLargestEle(A, k, low, q-1);
			}
		} 
	}
	
	static void kthSmallestEle(int []A, int k, int low, int high){
		if(low<high){
			int q=partition(A, low, high);
			
			if(q==low+k){
				System.out.print(A[q]);
			} else if(low+k<q){
				kthSmallestEle(A, k, low, q);
			} else if(low+k>q){
				kthSmallestEle(A, k-q, q+1, high);
			} 
		} 
	}
	
	static int partition(int []A, int low, int high){
		int x=A[low];
		int i=low, j=high;
		while(i<j){
			while(A[i]<=x && i<high){
				i++;
			}
			while(A[j]>x){
				j--;
			}
			if(i<j){
				swap(A, i, j);
			}
		}
		A[low]=A[j];
		A[j]=x;
		
		return j;
	}
	
	
	static void swap(int []A, int i, int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
}
