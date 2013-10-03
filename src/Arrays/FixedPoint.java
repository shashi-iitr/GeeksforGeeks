/*Given an array of n distinct integers sorted in ascending order, 
write a function that returns a Fixed Point in the array, if there 
is any Fixed Point present in array, else returns -1., fixed point means A[i]=i.
*/

package Arrays;

public class FixedPoint {

	public static void main(String[] args){
		int []A={-10, -1, 0, 2, 3, 5, 30, 50, 100};
		int la=A.length;
		int b=fixedPoint(A, 0, la-1);
		System.out.print(b);
	}
	
	static int fixedPoint(int []A, int l, int h){
		int mid=(l+h)/2;
		if(h>=l){
			if(mid==A[mid]){
				return mid;
			} else if(mid>A[mid]){
				return fixedPoint(A, mid+1, h);
			} else if(mid<A[mid]){
				return fixedPoint(A, l, mid-1);
			}
		}
		return -1;
	}
}
