// Merge an array of size n into another array of size m+n

package Arrays;

public class MergeNPlusMLastZero {

	public static void main(String[] args){
		int []A={4, 6, 9, 11,22, 23 , 0,0,0,0};
		int []B={5, 10,12,21};
		int n=A.length;
		int [] b=mergeArr(A, B);
		for(int i=0; i<n; i++){
			System.out.print(b[i]+" ");
		}
	}
	
	static int [] mergeArr(int []A, int []B){
		int n=A.length;
		int m=B.length;
		int i=n-1, j=m-1, k=n-m-1;
		
		while(j>-1 && k>-1){
			if(A[k]>B[j]){
				A[i--]=A[k--];
			} else if(A[k]<B[j]){
				A[i--]=B[j--];
			} else{
				A[i--]=A[k--];
				A[i--]=B[j--];
			}
		}
		while(j>-1){
			A[i--]=B[j--];
		}
		while(k>-1){
			A[i--]=A[k--];
		}
		return A;
	}
}
