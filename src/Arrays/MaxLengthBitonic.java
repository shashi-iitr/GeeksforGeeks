/*Given an array A[0 ... n-1] containing n positive integers, 
a subarray A[i ... j] is bitonic if there is a k with A[i] < = k = A[j].
*/

package Arrays;

public class MaxLengthBitonic {

	public static void main(String[] args){
		int []A={12, 4, 78, 90, 45, 23};
		maxLen(A);
	}
	
	static void maxLen(int []A){
		int l=A.length;
		int []Inc=new int [l];
		int []Dec=new int [l];
		int count=1; Inc[0]=1;
		
		for(int i=1; i<l; i++){
			if(A[i]>A[i-1]){
				count++;
			}
			Inc[i]=count;
		}
		int countD=1; Dec[l-1]=1;
		for(int i=l-2; i>=0; i--){
			if(A[i]>A[i+1]){
				countD++;
			}
			Dec[i]=countD;
		}
		
		for(int i=0; i<l; i++){
			Inc[i]=Inc[i]+Dec[i]-1;
		}
		int max=Inc[0], j=0;
		for(int i=1; i<l; i++){
			if(max<Inc[i]){
				max=Inc[i];
				j=i;
			}
		}
		
		System.out.print(max+" "+A[j]);
	}
}
