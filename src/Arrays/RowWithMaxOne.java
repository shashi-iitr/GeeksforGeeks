//Given a boolean 2D array, where each row is sorted. 
//Find the row with the maximum number of 1s.

package Arrays;

public class RowWithMaxOne {

	public static void main(String[] args){
		int [][]A={{0, 0, 0, 0},{0, 0, 1, 1},{0, 0,0,0},{0,0,0,0}};
		int b=maxOne(A);
		System.out.print(b+" ");
		maxOneInRow(A, 4, 4);
	}
	
	
	//O(n+m)
	static void maxOneInRow(int [][]A, int m, int n){
		int j=m-1, i=0, k=0, t=m-1;
		for(i=0; i<n; ){
			
			while(A[i][j]==1){
				if(j==0){
					System.out.print(i+" ");
					return;
				}
				if(j<t){
					k=i;
				}
				j--;
			} if(A[i][j]==0){
				if(i==n-1){
					System.out.print(k+" ");
					return;
				}
				i++;
			}
		}
	}
	
	
	//O(n^2)
	static int maxOne(int [][]A){
		int l=A.length;
		int maxO=0, k=0;
		for(int i=0; i<l; i++){
			int count=0;
			for(int j=0; j<l; j++){
				if(A[i][j]==1){
					count++;
				}
			}
			if(count>maxO){
				maxO=count;
				k=i;
			}
		}
		return k;
	}
}
