//Given a sorted array of n integers where each integer is in the range from 0 to m-1 and m > n

package Arrays;

public class SmallestMissingEle {

	public static void main(String[] args) {
		int[] A = {0, 1, 1, 2, 2, 2,3, 4, 5,10,11,12,13 };
		int b = smallestMissingEle(A);
		System.out.print(b);
	}

	static int smallestMissingEle(int[] A) {
		int l = A.length;
		int i = 0;
		if(A[0]!=0){
			return 0;
		}
		while (i<l-2 && (A[i] == A[i + 1] || A[i] == A[i+1] - 1 )) {
			i++;
		}
		if (i == l - 2 && (A[i]==A[i+1] || A[i]==A[i+1]-1)) {
			return (A[i+1] + 1);
		} else return A[i]+1;
	}
}
