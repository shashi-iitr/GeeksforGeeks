package Arrays;

public class UniqueRowsInMatrix {

	public static void main(String[] args){
		int[][]A={{0,1,0,0,1},{1,0,1,1,0},{0,1,0,0,1},{1,1,1,0,0}};
		int lr=A.length;
		int lc=A[0].length;
		uniqRow(A, 0, lr, lc);
		
	}
	
	static void uniqRow(int [][]A, int i, int lr, int lc){
		while(i!=lr){
			if(A[i][0]==-1){
				i++;
			}
			int temp[]=new int[lc];
			int j=0;
			while(j<lc){
				temp[j]=A[i][j++];
			}
			int f=i+1;
			if(f<lr){
				for(int k=f; k<lr; k++){
					if(isSame(A, temp, k)){
						A[k][0]=A[k][0]*(-1)-1;
						
					}
				}
			}
			
			uniqRow(A, i+1, lr, lc);
		}
		
		print(A, lr, lc);
		
	}
	
	static void print(int [][]A, int m, int n){
		for(int t=0; t<m; t++){
			for(int j=0; j<n; j++){
				if(A[t][0]>-1){
					System.out.print(A[t][j]+" ");
				}
			}
			System.out.println();
		}
		System.exit(0);
	}
	
	
	static boolean isSame(int[][] A, int []temp, int k){
		int l=A.length;
		for(int i=0; i<l; i++){
			if(A[k][i]!=temp[i]){
				return false;
			}
		}
		return true;
	}
}
