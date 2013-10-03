/*Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell 
mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
*/

package Arrays;

public class OneInAllRowsNColumns {

	public static void main(String[] args){
		int [][]A={{0,0,0,0},{0,0,1,0},{0,0,0,0},{0,0,0,0}};
		int l=A.length;
		print(A, l);
		System.out.println();
		int [][]b=oneMat(A);
		print(b, l);
	}
	
	static int[][] oneMat(int [][]A){
		int n=A.length;
		int []I=new int [n];
		int []J=new int [n];
		int i=0;
		while(i<n){
			for(int j=0; j<n; j++){
				if(A[i][j]==1){
					I[i]=1;
				}
			}
			i++;
		}
		int s=0;
		while(s<n){
			for(int d=0; d<n; d++){
				if(A[d][s]==1){
					J[s]=1;
				}
			}
			s++;
		}
		for(int k=0; k<n; k++){
			if(I[k]==1){
				for(int p=0; p<n; p++){
					A[k][p]=1;
				}
			}
		}
		for(int k=0; k<n; k++){
			if(J[k]==1){
				for(int p=0; p<n; p++){
					A[p][k]=1;
				}
			}
		}
		
		return A;
	}
	
	static void print(int [][]A, int l){
		for(int i=0; i<l; i++){
			for(int j=0; j<l; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}
