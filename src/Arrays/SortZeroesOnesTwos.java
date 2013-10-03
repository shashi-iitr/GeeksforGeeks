//Sort an array of 0s, 1s and 2s

package Arrays;

public class SortZeroesOnesTwos {

	public static void main(String[] args){
		int []A={0,1,2,1,0,0,0,1,1,2,0,1,0,0,2,1,2,0,1,0,2};
		int [] b=sort012(A);
		for(int i=0; i<A.length; i++){
			System.out.print(b[i]+" ");
		}
	}
	
	static int [] sort012(int []A){
		int i=0, j=A.length-1, k=j;
		while(i<j){
			while(A[i]==0){
				i++;
			}
			while(A[j]!=0){
				j--;
			}
			if(i<j){
				swap(A,i,j);
			}
		}
		
		while(i<k){
			while(A[i]==1){
				i++;
			}
			while(A[k]!=1){
				k--;
			}
			if(i<k){
				swap(A,i,k);
			}
		}
		return A;
	}
	
	static void swap(int []A, int i, int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
}
