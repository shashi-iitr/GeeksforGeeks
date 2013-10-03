// Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal 
// to the sum of elements at higher indexes

package Arrays;

public class EquilibriumIndex {

	public static void main(String[] args){
		int []A={2,3,-3,5,-5,-3,10};
		eqbNSpace(A);
		System.out.println();
		eqbIndex(A);
		System.out.println();
		eqb(A);
	}
	
	static void eqbNSpace(int []A){
		int l=A.length, s=0;
		for(int i=0; i<l; i++){
			s+=A[i];
		}
		int ts=s;
		for(int i=0; i<l-1; i++){
			ts-=A[i];
			
			if(ts==(s-A[i])/2){
				System.out.print(i+" ");
			}
		}
	}
	
	
	static void eqbIndex(int []A){
		int l=A.length;
		
		int [] B=new int [l];
		int [] C=new int [l];
		B[0]=A[0]; C[l-1]=A[l-1];
		for(int i=1, j=l-2; i<l && j>-1 ; j--, i++){
			B[i]=B[i-1]+A[i];
			C[j]=A[j]+C[j+1];
		}
		
		for(int i=0; i<l-2; i++){
			if(B[i]==C[i+2]){
				System.out.print((i+1)+" ");
			}
		}
	}
	
	
	static void eqb(int []A){
		int l=A.length, sum=0;
		int leftSum=0;
		for(int i=0; i<l; i++){
			sum=sum+A[i];
		}
		for(int i=0; i<l; i++){
			sum-=A[i];
			if(leftSum==sum){
				System.out.print("i= "+i);
			} else leftSum+=A[i];
		}
	}
}
