//Print a given matrix in spiral form

package Arrays;

public class SpiralMatrix {

	public static void main(String[] args){
		int [][]A={{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16},{22,23,24,25}};
		print(A, 5, 4);
		System.out.println();
		spiralMatrix(A, 0, 0, 5, 4);
	}
	
	static void spiralMatrix(int [][]A, int i, int j, int n, int m){

		while(j<m && A[i][j]!=0){
			System.out.print(A[i][j]+" ");
			A[i][j]=0;
			j++;
		}
		j--;
		i++;
		while(i<n && A[i][j]!=0){
			
			System.out.print(A[i][j]+" ");
			A[i][j]=0;
			i++;
		}
		i--;
		j--;
		
		while(j>-1 && A[i][j]!=0){
			System.out.print(A[i][j]+" ");
			A[i][j]=0;
			j--;
		}
		j++;
		i--;
		if(A[i][j]==0){
			return;
		} else
		while(i>-1 && A[i][j]!=0){
			System.out.print(A[i][j]+" ");
			A[i][j]=0;
			i--;
		}
		
		spiralMatrix(A, i+1, j+1, n,m);
	}
	
	static void print(int [][]A, int n, int m){
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(A[i][j]+" ");
			}System.out.println();
		}
	}
}
