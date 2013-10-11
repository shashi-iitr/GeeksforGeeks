package Arrays;

import utility.QuickSort;

public class ThreePairSumX {

	public static void main(String[] args){
		int []A={4,8,12,5,3,1,9,7,6,2,8};
		int sum= 11;
		int l=A.length;
		threeSumPairX(A, l, sum);
	}
	
	static void threeSumPairX(int []A, int l, int sum){
		new QuickSort().quickSort(A, 0, l-1);
		for(int i=0; i<l-1; i++){
			for(int k=i+1, j=l-1; k<j;){
				if(A[i]+A[j]+A[k] == sum){
					System.out.println("("+A[i]+", "+A[j]+", "+A[k]+") ");
					k++; j--;
				} else if(A[i]+A[j]+A[k]>sum){
					j--;
				} else k++;
			}
		}
	}
}
