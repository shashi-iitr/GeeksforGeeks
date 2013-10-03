/*Given two arrays: arr1[0..m-1] and arr2[0..n-1]. 
Find whether arr2[] is a subset of arr1[] or not. Both the arrays are not in sorted order
*/

package Arrays;

import java.util.HashSet;

public class SubsetArr {

	public static void main(String[] args) {
		int[] A = { 5, 4, 9, 2, 1, 3 };
		int[] B = { 4, 3, 1 };
		
		if(isSubsetHash(A, B)){
			System.out.print("true for hashed");
		}
		else System.out.print("False for hashed");
		
		System.out.println();
		
		if (isSubset(A, B)) {
			System.out.print("true");
		}
		else System.out.print("False");
	}
	
	static boolean isSubsetHash(int []A, int []B){
		HashSet<Integer> aSet= new HashSet<Integer>();
		for(int a: A){
			aSet.add(a);
		}
		
		for(int a:B){
			if(!aSet.contains(a)){
				return false;
			}
		}
		return true;
		
	}
	
	
	static boolean isSubset(int[] A, int[] B) {
		int la = A.length, lb = B.length;
		int maxA = maxEle(A, la);
		int maxB = maxEle(B, lb);

		if (maxB > maxA) {
			return false;
		}

		int[] C = new int[maxA+1];
		for (int i = 0; i < la; i++) {
			C[A[i]] = -1;
		}
		for (int i = 0; i < lb; i++) {
			C[B[i]] *= (-1);
		}
		int count = 0;
		for (int i = 0; i < la; i++) {
			if (C[i] == 1) {
				count++;
			}
		}
		if (count == lb) {
			return true;
		}

		return false;
	}
	

	static int maxEle(int[] a, int l) {
		int max = a[0];
		for (int i = 1; i < l; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
}
