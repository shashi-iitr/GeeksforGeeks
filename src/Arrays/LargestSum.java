// Largest Sum Contiguous Subarray

package Arrays;

public class LargestSum {

	public static void main(String[] args){
		
		int []A={2, 8, -3, 6, -13, 4, 7, 2, -18, 19, -17, 8, -16, 10};
		int b=maxSum(A);
		System.out.print(b);
	}
	
	static int maxSum(int [] A){
		int maxSum=A[0], tempSum=0;
		int n=A.length;
		for(int i=0; i<n; i++){
			tempSum=tempSum+A[i];
			if(tempSum<0){
				tempSum=0;
			} else{
				if(tempSum>maxSum){
					maxSum=tempSum;
				}
			}
		}
		return maxSum;
	}
}
