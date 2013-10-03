//Program for array rotation

package Arrays;

public class ArrayRotation {

	public static void main(String[] args){
		int [][]A={{1,2,3}, {4,5,6},{7,8,9}};
		int l=A.length;
		printArr(A, l);
		int [][] b=arrRot(A, l);
		System.out.println();
		printArr(b, l);
	}
	
	static int [][]arrRot(int [][]A, int l){
		int [][]B=new int [l][l];
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
			}
			System.out.println();
		}
	}
}
