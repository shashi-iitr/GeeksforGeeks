//Median of two sorted arrays

package Arrays;

public class MedianTwoSortedArray {

	public static void main(String[] args){
		int []A={2,4,9,12,15,18};
		int la=A.length;
		int []B={1,5,7,11,16,19};
		int lb=B.length;
		mergeArr(A, la, B, lb);
	}
	
	static void mergeArr(int[]A, int la, int[]B, int lb){
		
		int []C=new int[la+lb];
		int a=0, b=0, k=0;
		while(a<la && b<lb){
			if(A[a]>B[b]){
				C[k]=B[b];
				b++;
				System.out.print(C[k]+" ");
			} else if(A[a]<B[b]){
				C[k]=A[a];
				a++;
				System.out.print(C[k]+" ");
			} else {
				C[k]=A[a];
				System.out.print(C[k]+" ");
				C[++k]=B[b];
				System.out.print(C[k]+" ");
				a++;
				b++;
			}
			k++;
		}
		
		while(a<la){
			C[k]=A[a];
			a++;
			System.out.print(C[k]+" ");
			k++;
		}
		
		while(b<lb){
			C[k]=B[b];
			b++;
			System.out.print(C[k]+" ");
			k++;
		}
		System.out.println();
		System.out.print("median= "+C[(la+lb)/2]);
	}
}
