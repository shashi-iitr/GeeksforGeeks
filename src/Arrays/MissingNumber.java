

package Arrays;

public class MissingNumber {

	public static void main(String[] args){
		int []A={ 1, 3, 6, 5, 2, 4};
		int n=A.length;
		int c=misNo(A, n);
		System.out.print(c);
	}
	
	static int misNo(int []A, int l){
		int [] b=new int [l+2];
		
		int j=0;
		for(int i=0; i<l; i++){
			b[A[i]]=1;
		}
		
		for(j=1; j<l+2; j++){
			if(b[j]!=1){
				return j;
			}
		}
		
		return j;
	}
}
