// Segregate Even and Odd numbers

package Arrays;

public class SegregateEvensOdds {

	public static void main(String[] args){
		int []A={2,4,3,5,6,2,9,7,8,1};
		int [] b=evensOdds(A);
		for(int i=0; i<A.length; i++){
			System.out.print(b[i]+" ");
		}
	}
	
	static int [] evensOdds(int []A){
		int i=0, j=A.length-1;
		while(i<j){
			while(A[i]%2==0){
				i++;
			}
			while(A[j]%2!=0){
				j--;
			}
			if(i<j){
				swap(A, i, j);
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
