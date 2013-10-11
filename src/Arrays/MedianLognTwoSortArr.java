package Arrays;

public class MedianLognTwoSortArr {

	public static void main(String[] args){
		int []A={3, 5, 9, 10, 15, 20, 21, 23};
		int la=A.length;
		int []B={2, 5, 8, 11, 13, 19};
		int lb=B.length;
	}
	
	
	static void median(int []A, int al, int ah, int []B, int bl, int bh){
		int aMid=al+(ah-al)/2;
		int bMid=bl+(bh-bl)/2;
		int aMed=A[aMid];
		int bMed=B[bMid];
		if(ah-al+bh-bl<4){
			return;
		}
		if(aMed=bMed){
			
		}
		else if(aMed<bMed){
			median(A, aMid, ah, B, bl, bMid+1);
		} else median(A, al, aMid+1, B, bMid+1, bh);
	}
}
