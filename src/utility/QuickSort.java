package utility;

public class QuickSort {

	public int[] quickSort(int[] A, int low, int high) {
		if (low < high) {
			int x = partition(A, low, high);
			quickSort(A, low, x - 1);
			quickSort(A, x + 1, high);
		}
		return A;
	}

	
	private int partition(int[] A, int low, int high) {
		int i = low, j = high, pivot = A[low];
		while (i < j) {
			while (A[i] <= pivot && i < high) {
				i++;
			}
			while (A[j] > pivot) {
				j--;
			}
			if (i < j) {
				new Swap().swapInArray(A, i, j);
			}
		}
		A[low] = A[j];
		A[j] = pivot;
		return j;
	}
}
