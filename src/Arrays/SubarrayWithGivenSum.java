/*Given an unsorted array of nonnegative integers, 
find a continous subarray which adds to a given number.
*/

package Arrays;

public class SubarrayWithGivenSum {

	public static void main(String[] args){
		int []A={1, 4, 20, 3, 10, 5, 18};
		int sum=33;
		sumSubArr(A, sum);
		subArr(A, sum);
	}
	
	
	static void sumSubArr(int []A, int sum){
		int sumM=A[0], i=0,j, l=A.length;
		for(j=1; j<l; j++){
			
			while(sumM>sum && i<j-1){
				sumM-=A[i];
				i++;
			}
			if(sumM==sum){
				System.out.println("(i= "+i+", j= "+(j-1)+") ");
			}
			
			if(j<l){
				sumM+=A[j];
			}
		}
	}
	
	
	
	static void subArr(int []A, int sum){
		int l=A.length;
		for(int i=0; i<l-1; i++){
			int sumM=A[i];
			for(int j=i+1; j<l; j++){
				sumM+=A[j];
				if(sumM==sum){
					System.out.print("("+"i= "+i+", j= "+j+" ) ");
				}
			}
		}
	
	
	}
}
