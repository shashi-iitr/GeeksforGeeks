//Write a program to reverse an array

package Arrays;

public class ReverseArray {

	public static void main(String [] args){
		int [] A={1,2,3,4,5,6,7,8};
		int l=A.length, j=0;
		int []b =reverseArrRecursively(A, 0, l-1);
		
		for(int i:b){
			System.out.print(b[j++]+" ");
		}
	}
	
	static int [] reverseArrRecursively(int [] A, int i, int n){
		if(i>=n){
			return A ;
		} else{
			swap(A, i, n);
		}
		return reverseArrRecursively(A, i+1, n-1);
	}
	
	static void swap(int []A, int i, int j){
		int t=A[i];
		A[i]=A[j];
		A[j]=t;
	}
}
