//Given an unsorted array arr[] and two numbers x and y, 
//find the minimum distance between x and y in arr[]

package Arrays;

public class MinDiffInPositnOfTwoEle {

	public static void main(String[] args) {
		int[] A = { 1, 4, 2, 6, 3, 8, 9, 5 };
		int x = 3, y = 5;
		int b = minDifEle(A, x, y);
		System.out.print(b);
	}

	static int minDifEle(int[] A, int x, int y) {
		int min = 0, l = A.length;
		int countX = 0, countY = 0;
		for (int i = 0; i < l; i++) {
			if (A[i] == x) {
				countX++;
			}
			if (A[i] == y) {
				countY++;
			}
		}
		int k = 0, t = 0;
		int[] cX = new int[countX+1];
		int[] cY = new int[countY+1];
		for (int i = 0; i < l; i++) {
			if (A[i] == x) {
				cX[k++] = i;
			}
			if (A[i] == y) {
				cY[t++] = i;
			}
		}

		return min;
	}

	static void minEle(int[] A, int x, int y) {
		int i = 0;
		while (A[i] != x || A[i] != y) {
			i++;
		}
		if (A[i] == x) {
			while (A[i] != x || A[i] != y) {
				i++;
			}
		}
	}
}
