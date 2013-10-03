package Arrays;

public class GivenEleForMajorityEle {

	public static void main(String[] args){
		int[]A={1, 2, 3, 3, 3, 3, 10};
		int x=3, l=A.length;
		int j=searchEleX(A, 0, l-1, x);
		if(j==-1){
			System.out.print("x is not a major element");
		}
		if(isExistX(A, j, l-1, x)){
			System.out.print("x is major element");
		} else
			System.out.print("x is not a major element");
		
	}
	
	static boolean isExistX(int []A, int i, int l, int x){
		int k=i+l/2;
		if(k<=l && A[k]==x){
			return true;
		} else
			return false;
	}
	
	static int searchEleX(int [] A, int i, int l, int x){
		int mid=(i+l)/2;
		if(i<0 || l<0 || l<i){
			return -1;
		}
		if(A[mid]==x){
			return mid;
		} else if(A[mid]<x){
			return searchEleX(A, mid+1, l, x);
		}
		else
			return searchEleX(A, i, mid-1, x);
	}
}
