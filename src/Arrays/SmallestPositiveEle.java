// Find the smallest positive number missing from an unsorted array

package Arrays;

public class SmallestPositiveEle {

	public static void main(String[] args){
		int []A={2, 3, 7, 6, 8, -1, -10, 15};
		smallestPositiveEle(A);
	}
	
	static void smallestPositiveEle(int []A){
		int l=A.length;
		int i=0, j=l-1;
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
		for(int h=0; h<l; h++){
			A[h]=Math.abs(A[h]);
		}
		
		for(int k=i; k<l; k++){
			if((Math.abs(A[k]))<l){
				A[Math.abs(A[k])]=A[Math.abs(A[k])]*(-1);
			}
		}
		for(int k=1; k<l; k++){
			if(A[k]>0){
				System.out.print(k+" ");
				return;
			}
		}
	}
	
	static void swap(int []A, int i, int j){
		int t=A[i];
		A[i]=A[j];
		A[j]=t;
	}
}
