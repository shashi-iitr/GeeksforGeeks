/*Search in a row wise and column wise sorted matrix- Given an n x n matrix, 
where every row and column is sorted in increasing order. 
Given a number x, how to decide whether this x is in the matrix
*/


package Arrays;

public class SearchEleInNbyNMatrix {

	public static void main(String[] args){
		int [][]A={{1,4,8,17}, {2,10,15,18}, {3,12,20,21}, {4,15,23,30}};
		int n=A.length;
		int x=18;
		search(A, 0, n-1, x, n);
		
	}
	
	static void search(int [][]A, int i, int j, int x, int n){
		if(A[i][j]==x){
			System.out.print("i= "+i+" j= "+j);
		} else if(A[i][j]>x){
			if(j==0){
				System.out.print("lol j= "+j+" x not found");
				return;
			} else
			search(A, i, j-1, x, n);
		} else if(A[i][j]<x){
			if(i==n-1){
				System.out.print("lol i= "+i+" x not found");
				return;
			} else 
				search(A, i+1, j, x, n);
		}
	}
}
