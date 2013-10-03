//Given an array A[] and a number x, check for pair in A[] with sum as x

package Arrays;

public class PairSumEqualsX {

	public static void main(String[] args){
		int []A={5, 1, 3, 8, 6, 4, 3, 7, 2};
		int x=7;
		
		pairSumXN2(A, x);
		System.out.println();
		
		int l=A.length;
		quickSortA(A, 0, l-1);
		pairSumX(A, x);
		
	}
	
	static void pairSumX(int []A, int x){
		int l=A.length;
		int i=0, j=l-1;
		while(i<j){
			if(A[i]+A[j]>x){
				j--;
			}
			if(A[i]+A[j]==x){
				System.out.print("("+A[i]+" "+A[j]+") ");
				i++;
				j--;
			}
			if(A[i]+A[j]<x){
				i++;
			}
		}
		
	}
	
	static void quickSortA(int []A, int p, int q){
		if(p<q){
			int x=partitionA(A, p, q);
			quickSortA(A, p, x);
			quickSortA(A, x+1, q);
		}
	}
	
	static int partitionA(int []A, int p, int q){
		int  pivot=A[p], i=p, j=q;
		while(i<j){
			while(A[i]<pivot){
				i++;
			}
			while(A[j]>pivot){
				j--;
			}
			if(i<j){
				swap(A, i, j);
			} else return j;
		}
		
		return j;
	}
	
	static void swap(int []A, int a, int b){
		int t=A[a];
		A[a]=A[b];
		A[b]=t;
	}
	
	
	
	//O(n^2)
	static void pairSumXN2(int [] A, int a){
		int n=A.length;
		for(int i=0; i<n-1;i++){
			for(int j=i+1; j<n; j++){
				if(A[i]+A[j]==a){
					System.out.print(" ("+A[i]+" "+A[j]+")");
				}
			}
		}
	}
	
}
