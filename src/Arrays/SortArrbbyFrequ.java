// completed -  Sort elements by frequency | Set 1


package Arrays;

public class SortArrbbyFrequ {

	public static void main(String[] args){
		int [] A={3,2,2,1,2,2,1,4,5,9,4,7,7,4,4,1,1};
	
		findMaxInA(A);
		
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+" ");
		}
	}
	
	static void findMaxInA(int []A){
		int max=A[0];
		int la=A.length;
		for(int i=1; i<la; i++){
			if(max<A[i]){
				max=A[i];
			}
		}
		
		int [][]B=new int [2][max+1];
		for(int j=0; j<la; j++){
			B[1][A[j]]++;
		}
		for(int i=0; i<=max; i++){
			B[0][i]=i;
		}
		printB(B);
		System.out.println();
		
		sortB(B);
		
		printB(B);
		System.out.println();
		
		sortInA(A, B);
	}
	
	static void printB(int [][]B){
		int lb=B[1].length;
		for(int i=0; i<lb; i++){
			System.out.println(B[0][i]+" "+ B[1][i]);
			//System.out.print(B[1][i]+" ");
			//System.out.println();
		} 
	}
	
	static void sortB(int [][]B){
		int lb=B[1].length;
		int j=1;
		while(j<lb){
			int min=B[1][j];
			int minPos=j;
			for(int i=j+1; i<lb; i++){
				if(min>B[1][i]){
					min=B[1][i];
					minPos=i;
				}
			}
			for(int i=0; i<2; i++){
				swap2D(B, i, minPos, j);
			}
			j++;
		}
		
	}
	
	static void sortInA(int []A, int[][]B){
		int lb=B[1].length;
		int sum=0, k=0;
		for(int i=0; i<lb; i++){
			if(B[1][i]!=0){
				int j=i;
				sum=sum+B[1][i];
				for(; k<sum; k++){
					A[k]=B[0][i];
				}
			}
		}
	}
	
	static void swap2D(int [][] B, int i, int minPos, int j){
		int temp1=B[i][minPos];
		B[i][minPos]=B[i][j];
		B[i][j]=temp1;
	}
}
