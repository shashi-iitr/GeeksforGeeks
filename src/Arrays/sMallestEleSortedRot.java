// find smallest element in a sorted n rotated array if elements r repeated


package Arrays;

public class sMallestEleSortedRot {

	public static void main(String[] args){
		int []A={6,7,8,9,4,5};
		int la=A.length;
		smallestSortRot(A, 0, la-1);
		
		int []B={2,2,3,3,4,4,4,5,2,2};
		int lb=B.length;
		int b=smallRepSortRot(B, 0, lb-1);
		System.out.print("\nrep method "+b);
	}
	
	
	static int smallRepSortRot(int []A, int l, int h){
		if(l<0 || h<0 || h<l){
			return 0;
		}
		if(h<l){
			return A[0];
		}
		int mid=(l+h)/2;
		
		if(mid>l && A[mid]<A[mid-1]){
			return A[mid];
		} else if(mid<h && A[mid]>A[mid+1]){
			return A[mid+1];
		} else if(A[l]==A[mid] && A[mid]==A[l]){
			return min(smallRepSortRot(A, l, mid-1), smallRepSortRot(A, mid+1, h));
		} else if(A[h]>A[mid]){
			return smallRepSortRot(A, l, mid-1);
		}else 
			return smallRepSortRot(A, mid+1, h);
		
	}
	
	static int min(int a, int b){
		return a>b?b:a;
	}
	
	
	
	
	static void smallestSortRot(int []A, int l, int h){
		int mid=(l+h)/2;
		if(l<0 || h<0 || h<l){
			return;
		}
		/*if(mid==A.length-1 || mid==0){
			System.out.print(A[mid]);
			return;
		}*/
		if(l==h){
			System.out.print(A[l]);
			return;
		}
		if(mid<h && A[mid]>A[mid+1]){ 
			System.out.print(A[mid+1]);
			return;
		} else if(mid>l && A[mid]<A[mid-1]){
			System.out.print(A[mid]);
			return;
		}
		else if(A[mid]<=A[h]){
			smallestSortRot(A, l, mid);
		} else if(A[mid]>A[h]){
			smallestSortRot(A, mid+1, h);
		}
	}
}
