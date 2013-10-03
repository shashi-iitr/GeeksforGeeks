package Arrays;

public class MatrixRot {

	public static void main(String[] args){
		int [][]A={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int l=A.length;
		printArr(A, l);
		System.out.println();
		int [][]b=matRot(A);
		printArr(b, l);
	}
	
	static int [][]matRot(int [][]A){
		int l=A.length;
		 int [][] B = new int [l][l];
		for(int i=0; i<l; i++){
			for(int j=0; j<l; j++){
				B[j][l-i-1]=A[i][j];
			}
		}
		return B;
	}
	
	static void printArr(int [][]A, int l){
		for(int i=0; i<l; i++){
			for(int j=0; j<l; j++){
				System.out.print(A[i][j]+" ");
			}System.out.println();
		}
	}
}
