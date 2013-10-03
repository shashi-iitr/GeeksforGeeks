/*Given an unsorted array and a number n, find if there exists a pair 
of elements in the array whose difference is n
*/


package Arrays;

public class PairDiff {

	public static void main(String[] args){
		int []A={2,5,32,6,45,7};
		int x=5;
		pairDiff(A, x);
	}
	
	static void pairDiff(int [] A, int x){
		int l=A.length;
		quickSort(A, 0, l-1);
		int i=0, j=1;
		while(i<l && j<l){
			if(A[j]-A[i]==x){
				System.out.print(A[i]+" "+A[j]);
			}
			if(A[j]-A[i]>x){
				i++;
			} else j++;
		}
	}
	
	static void quickSort(int []A, int p, int r){
		if(p<r){
			int q=partition(A, p, r);
			quickSort(A, 0, q);
			quickSort(A, q+1, r);
		}
	}
	
	static int partition(int []A, int p, int r){
		int x=A[p], i=p, j=r;
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
		int t=A[i];
		A[i]=A[j];
		A[j]=t;
	}
	
}
