/*Given an array of n elements which contains elements from 0 to n-1, 
with any of these numbers appearing any number of times. 
Find these repeating numbers in O(n) and using only constant memory space.
*/

package Arrays;

public class DuplicateEleNTime1Space {

	public static void main(String[] args){
		int []A={1,5,1,0,0,2,5,1,2,4,4};
		dupEle(A);
	}
	
	static void dupEle(int []A){
		int l=A.length;
		for(int i=0; i<l; i++){
			if(A[Math.abs(A[i])]>0 && A[Math.abs(A[i])]<l){
				A[Math.abs(A[i])]*=(-1);
			}
			if(A[Math.abs(A[i])]<0){
				A[Math.abs(A[i])]=A[Math.abs(A[i])]*(-1)+l;
			} 
			if(A[Math.abs(A[i])%l]==0){
				A[Math.abs(A[i])%l]+=l;
			}
			if(A[Math.abs(A[i])%l]>=l){
				A[Math.abs(A[i])%l]+=l;
			}
		}
		
		for(int i=0; i<l; i++){
			if(A[i]>l){
				System.out.print(i+" ");
			}
		}
	}
}
