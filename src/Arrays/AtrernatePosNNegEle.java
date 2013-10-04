// Alternate positive and negative elements in a array, in sorted way

package Arrays;

public class AtrernatePosNNegEle {

	public static void main(String[] args){
		int []A={-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int []b=PosAndNegAlter(A);
		for(int i=0; i<A.length; i++){
			System.out.print(b[i]+" ");
		}
	}
	
	static int [] PosAndNegAlter(int []A){
		int i=0, j=A.length-1, k=0, h=0;
		while(i<j){
			while(A[i]<0){
				i++;
			}
			while(A[j]>0){
				j--;
			}
			if(i<j){
				swap(A, i, j);
			}
		}
		
		while(A[k]<0){
			k++;
		}
		
		int f=k;
		quickSort(A, 0, k-1);
		quickSort(A, k, A.length-1);
		
		
		int g=0, l=A.length;
		while(f<l && g<l && A[g]<0){
			swap(A, g, f);
			g+=2;
			f++;
		}
		
		
		return A;
	}
	
	static void quickSort(int [] a, int i, int j){
		if(i<j){
			int x=partition(a, i, j);
			quickSort(a, 0, x);
			quickSort(a, x+1, j);
		}
	}
	
	static int partition(int []a, int p, int q){
		int i=p;
		int j=q, pivot=a[p];
		
		while(i<j){
			while(a[i]<pivot){
				i++;
			}
			while(a[j]>pivot){
				j--;
			}
			if(i<j){
				swap(a, i, j);
			}
		}
		return j;
	}
	
	static void swap(int []A, int i, int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
}
