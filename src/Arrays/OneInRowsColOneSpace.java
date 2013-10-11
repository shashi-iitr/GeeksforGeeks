/*Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell 
mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
*/


package Arrays;

public class OneInRowsColOneSpace {

	public static void main(String[] args){
		int [][]A={{1,0,0,0},{0,0,1,0},{0,0,0,0},{0,0,0,1}};
		int l=A.length;
		print(A, l);
		System.out.println();
		int [][]b=oneMat(A);
		print(b, l);
		
	}
	
	static int [][] oneMat(int [][]A){
		int n=A.length;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(A[i][j]==1){
					A[0][j]-=2;
				}
			}
		}
		
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				if(A[i][j]==1){
					A[i][0]-=2;
					
				}
			}
		}
		
		for(int i=1; i<n; i++){
			if(A[i][0]<0){
				for(int j=1; j<n; j++){
					A[i][j]-=2;
				}
			}
		}
		for(int j=1; j<n; j++){
			if(A[0][j]<0){
				for(int i=1; i<n; i++){
					A[i][j]-=2;
				}
			}
		}
		if(A[0][0]<0){
			for(int i=1; i<n; i++){
				A[i][0]-=2;
			}
			for(int j=1; j<n; j++){
				A[0][j]-=2;
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(A[i][j]<0){
					A[i][j]=1;
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
