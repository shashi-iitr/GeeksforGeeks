/*Given an unsorted array of size n. Array elements are in range from 1 to n. 
One number from set {1, 2, …n} is missing and one number occurs twice in array. Find these two numbers.
*/


package Arrays;

public class MissingAndRepeatingEle {
	public  static void main(String [] args){
		int []A={3,1,4,5,6,6};
		repMissEleOneSpace(A);
	}
	
	
	static void repMissEleOneSpace(int []A){
		int l=A.length;
		for(int i=0; i<l; i++){
			A[i]*=(-1);
		}
		for(int i=0; i<l; i++){
			if(A[Math.abs(A[i])-1]<0){
				A[Math.abs(A[i])-1]*=(-1);
			} else {
				System.out.println("repeated element is= "+Math.abs(A[i]));
			}
		}
		
		for(int i=0; i<l; i++){
			if(A[i]<0){
				System.out.println("missing element is= "+ (i+1));
				return;
			}
		}
	}
}
