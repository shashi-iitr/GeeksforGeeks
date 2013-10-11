//given an array, find the pair which gives sum closest to zero

package Arrays;

public class SumPairCloseToZero {

	public static void main(String[] args){
		int []A={42,-65,1,84,-32,-23,-45};
		int l=A.length;
		sumCloseZero(A, l);
	}
	
	
	//O(n^2)
	static void sumCloseZero(int []A, int l){
		int minS=A[0]+A[1], sum=0, I=0, J=0;
		for(int i=0; i<l-1; i++){
			for(int j=i+1; j<l; j++){
				sum=A[i]+A[j];
				if(Math.abs(minS)>Math.abs(sum)){
					minS=sum;
					I=i; J=j;
				}
			}
		}
		System.out.print(A[I]+" "+A[J]);
	}
}
