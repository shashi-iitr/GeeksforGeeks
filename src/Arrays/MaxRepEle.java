// find the max repeated element in an array

package Arrays;

public class MaxRepEle {

	public static void main(String[] args){
		int []A={2, 3, 3, 5, 2, 3, 4, 2, 1, 7, 2, 1};
		int l=A.length;
		int b=maxRep(A, l);
		System.out.print(b);
	}
	
	static int maxRep(int []A, int l){
		for(int i=0; i<l; i++){
			if(A[Math.abs(A[i])%l]>0 && A[Math.abs(A[i])%l]<l){
				A[Math.abs(A[i])%l]*=(-1);
			}
			else if(A[Math.abs(A[i])%l]<0){
				A[Math.abs(A[i])%l]=A[Math.abs(A[i])%l]*(-1)+l;
			} 
			else if(A[Math.abs(A[i])%l]==0){
				A[Math.abs(A[i])%l]+=l;
			}
			else if(A[Math.abs(A[i])%l]>=l){
				A[Math.abs(A[i])%l]+=l;
			}
		}
		
		int j=0;
		while(A[j]<l){
			j++;
		}
		int Index=j;
		int max=A[j];
		for(int k=j+1; k<l; k++){
			if(max<A[k]){
				max=A[k];
				Index=k;
			}
		}
		
		return Index;
	}
}
