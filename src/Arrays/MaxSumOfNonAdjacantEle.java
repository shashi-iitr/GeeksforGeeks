// Maximum sum such that no two elements are adjacent

package Arrays;

public class MaxSumOfNonAdjacantEle {

	public static void main(String[] args){
		int []A={5,  5, 10, 40, 50, 35};
		int b=maxSum(A, A.length);
		System.out.print(b);
	}
	
	static int maxSum(int []A, int l){
		int incSum=A[0], excSum=0;
		for(int i=1; i<l; i++){
			int tempInc=incSum;
			incSum=excSum+A[i];
			excSum=max(tempInc, excSum);
		}
		
		return max(incSum, excSum);
	}
	
	
	
	static int max(int a, int b){
		
		return a>b?a:b;
	}
	
}
