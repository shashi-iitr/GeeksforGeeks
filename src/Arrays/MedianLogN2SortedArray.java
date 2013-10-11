// median of 2 sorted array 

package Arrays;

import utility.Max;
import utility.Min;

public class MedianLogN2SortedArray {

	public static void main(String [] args){
		int []A={2,4,9,12,15,18, 21};
		int la=A.length;
		int []B={1,2,7,11,16,19, 23};
		int lb=B.length;
		int median= med(A, 0, la-1, B, 0, lb-1);
		System.out.print(median);
	}
	
	static int med(int []A, int ia, int la, int []B, int ib, int lb){
		int median=0;
		while(la-ia+1>2 && lb-ib+1>2){
			int ma=(la+ia)/2;
			int mb=(lb+ib)/2;
			if(A[ma]==B[mb]){
				return A[ma];
			}
			
			if(A[ma]>B[mb]){
				la=ma;
				ib=mb;
			} else {
				ia=ma;
				lb=mb;
			}
		}
		if(la-ia+1==2 && lb-ib+1==2){
			median =((new Max().max(A[0], B[0]))+(new Min().min(A[1], B[1])))/2;
		}
		return median;
	}
}
