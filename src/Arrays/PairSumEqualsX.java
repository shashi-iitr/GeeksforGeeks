//Given an array A[] and a number x, check for pair in A[] with sum as x

package Arrays;

import utility.QuickSort;

public class PairSumEqualsX {

	public static void main(String[] args){
		int []A={2,3,6,3,6,5,1,4};
		int x=7;
		
		pairSumXN2(A, x);
		System.out.println();
		
		int l=A.length;
		new QuickSort().quickSort(A, 0, l-1);
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
				if(A[i]==A[i+1]){
					i++;
				}
				else if(A[j]==A[j-1]){
					j--;
				}
				else if(A[i]!=A[i+1] && A[j]!=A[j-1]){
					i++; j--;
				}
			}
			if(A[i]+A[j]<x){
				i++;
			}
		}
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
