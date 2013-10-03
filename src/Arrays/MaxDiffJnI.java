//Given an array arr[], find the maximum j – i such that arr[j] > arr[i]

package Arrays;

public class MaxDiffJnI {

	public static void main(String[] args){
		int []A={2,5,4,7,9,12,4,19,7, 3,1};
		int b=maxDiff(A);
		System.out.print(b);
	}
	
	
	static int maxDiff(int []A){
		int i=0, j=A.length-1;
		while(A[i]>A[j] && i<j){
			j--;
		}
		if(i==j){
			return -1;
		}
		else
			return j-i;
	}
}
