//LEADERS in the array. An element is leader if 
//it is greater than all the elements to its right side

package Arrays;

public class LeaderInArr {

	public static void main(String[] args){
		int []A={16,17,4,3,5,2, 23, 1, 2,};
		leader(A);
	}
	
	static void leader(int []A){
		int l=A.length;
		int max=A[l-1];
		for(int i=l-1; i>-1; i--){
			if(max<=A[i]){
				max=A[i];
				System.out.print(max+" ");
			}
		}
	}
}
