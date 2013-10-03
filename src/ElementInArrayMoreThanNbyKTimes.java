/* Given an array of of size n and a number k, 
 * find all elements that appear more than n/k times */


public class ElementInArrayMoreThanNbyKTimes {

	public static void main(String[] args){
		int n=20, k=9;
		int []A={4, 3, 3, 1, 1, 1, 3, 5, 4, 5, 6, 4, 5, 9, 9, 9, 10, 10, 4, 10};
		numberOfElements(A, n, k);
	}
	
	
	static void numberOfElements(int [] A, int n, int k){
		int max=A[0];
		for(int i=1; i<n; i++){
			if(max<A[i])
				max=A[i];
		}
		
		int [] B=new int [max+1];
		for(int j=0; j<n; j++){
			B[A[j]]+=1;
		}
		
		for(int i=0; i<=max; i++){
			if(B[i]>(n/k)){
				System.out.print(i+" ");
			}
		}
	}
}
