package Arrays;

import java.util.HashSet;

public class PairSumXHash {

	public static void main(String[] args){
		int []A={4,5,1,3,9,7,2, 6};
		int x=11;
		pairSumXHash(A, x);
	}
	
	static void pairSumXHash(int []A, int k){
		HashSet<Integer> aSet=new HashSet<Integer>();
		for(int a:A){
			aSet.add(a);
		}
		for(int i=0; i<A.length; i++){
			if(aSet.contains(k-A[i])){
				System.out.print(A[i]+" ");
			}
		}
	}
}
