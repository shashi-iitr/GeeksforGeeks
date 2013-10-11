//Given a boolean 2D array, where each row is sorted. 

//Find the row with the maximum number of 1s.

package Arrays;

public class RowWithMaxOne {

	public static void main(String[] args){
		int [][]A={{0,0,0,1},{0, 0, 0, 1},{0, 0,1,1},{0,0,0,1}};
		int n=A.length;
		int m=A[0].length;
		int b=maxOne(A);
		System.out.println(b+" ");
		maxOneInRow(A, m, n);
		System.out.println();
		maxRowOne(A, m, n);
	}
	
	static void maxRowOne(int [][]A, int m, int n){
		int i=0, j=m-1, k=-1;
		while(i<m && j>-1){
			if(A[i][j]==1){
				while(j>-1 && A[i][j]==1){
					j--;
					k=i;
				}
				j++;
				if(j==0){
					System.out.print(i);
					return;
				} else if(j>0){
					i++;
				}
			} else if(i<m && A[i][j]==0){
				i++;
			}
			if(i==m-1 && A[i][j]==0){
				System.out.print(k);
				return;
			}
		}
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
			} 
			if(A[i][j]==0){
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
