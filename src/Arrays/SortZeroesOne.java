//Segregate 0s and 1s in an array

package Arrays;

public class SortZeroesOne {

	public static void main(String[] args){
		int []A={1, 0, 1, 0, 0 ,1 ,0,1,1,1,0,0,1,0,1,0};
		int []b=zeroesOnes(A);
		for(int i=0; i<A.length; i++){
			System.out.print(b[i]+" ");
		}
	}
	
	static int [] zeroesOnes(int []A){
		int l=A.length;
		int i=0, j=l-1;
		while(i<j ){
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
		return A;
	}
	
	static void swap(int []A, int a, int b){
		int temp=A[a];
		A[a]=A[b];
		A[b]=temp;
	}
}
