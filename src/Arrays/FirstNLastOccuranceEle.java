package Arrays;

public class FirstNLastOccuranceEle {

	public static void main(String[] args){
		int []A={2, 2, 3, 3, 3,3, 10};
		int l=A.length ,k=3;
		int b=firstOcc(A,0, l-1, k);
		System.out.println(b);
		
		int c=lastOcc(A,0, l-1, k);
		System.out.println(c);
	}
	
	
	static int firstOcc(int []A,int low, int high, int k){
		if(high<0 || low<0 || high<low){
			return -1;
		}
		int mid=(low+high)/2;
		if(mid==low && A[mid]==k || A[mid]==k && A[mid-1]<k){
			return mid;
		} else if(A[mid]>=k){
			return firstOcc(A, low, mid-1, k);
		} else return firstOcc(A, mid+1, high, k);
	}
	
	
	
	static int lastOcc(int []A,int low, int high, int k){
		if(high<0 || low<0 || high<low){
			
			return -1;
		}
		int mid=(low+high)/2;
		if(mid==high && A[mid]==k || A[mid]==k && A[mid+1]>k){
			return mid;
		} else if(A[mid]>k){
			return lastOcc(A, low, mid-1, k);
		} else return lastOcc(A, mid+1, high, k);
	}
}
