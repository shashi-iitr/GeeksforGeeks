//Median of two sorted arrays

package Arrays;

public class MedianTwoSortedArr {

	public static void main(String[] args){
		int []A={1,4,6,9};
		int []B={2,3,5,7,9,10,12};
		int la=A.length, lb=B.length;
		int [] b=medianSortArr(A, la, B, lb);
		int median=b[(la+lb)/2];
		System.out.print(median);
	}
	
	static int [] medianSortArr(int []A, int la, int []B, int lb){
		int a=0, b=0, c=0;
		int []C=new int [la+lb];
		while(a<la && b<lb){
			if(A[a]>B[b]){
				C[c++]=B[b];
				b++;
			} else if(A[a]<B[b]){
				C[c++]=A[a];
				a++;
			} else {
				C[c++]=A[a];
				C[c++]=B[b];
				a++; b++;
			}
		}
		
		while(a<la){
			C[c++]=A[a];
			a++;
		}
		while(b<lb){
			C[c++]=B[b];
			b++;
		}
		
		return C;
	}
}
