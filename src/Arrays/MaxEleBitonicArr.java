package Arrays;

public class MaxEleBitonicArr {

	public static void main(String[] args){
		int []A={1, 3, 5, 10, 9,12,7, 6};
		int l=A.length;
		int b=maxEle(A,0,l-1);
		System.out.print(b);
	}
	
	static int maxEle(int []A, int l, int h){
		int mid=(l+h)/2;
		if(l==h){
			return A[l];
		}
		if(h==l+1){
			if(A[h]>A[l]){
				return A[h];
			} else return A[l];
		}else if(A[mid]>A[mid+1] && A[mid]>A[mid-1]){
			return A[mid];
		} else if(A[mid]>A[mid+1] && A[mid]<A[mid-1]){
			return maxEle(A, l, mid-1);
		} else if(A[mid]>A[mid-1] && A[mid]<A[mid+1]){
			return maxEle(A, mid+1, h);
		}
		return -1;
	}
}
