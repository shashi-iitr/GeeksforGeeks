/*Given an array that contains both positive and negative integers, 
 * find the product of the maximum product subarray. 
 * Expected Time complexity is O(n) and only O(1) extra space can be used.
*/


package Arrays;

public class MaxProductSubarray {

	public static void main(String[] args){
		int []A={1, -2, 3, -4,-3, -4, -3};
		int b=maxPro(A);
		System.out.print(b);
	}
	
	static int maxPro(int []A){
		int ep=1, mp=1, l=A.length;
		for(int i=0; i<l; i++){
			ep*=A[i];
			if(ep==0){
				ep=1;
			}
			if(mp<ep){
				mp=ep;
			}
		}
		return mp;
	}
}
