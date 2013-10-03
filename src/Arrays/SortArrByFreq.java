// Sort elements by frequency | Set 1

package Arrays;

public class SortArrByFreq {

	public static void main(String[] args){
		int [] A={3,3,3,2,2,8,9,5,7,7,7,2,1,1,5,1,4,1};
		
		int l=A.length;
		sortFreq(A, l);
	}
	
	static  void sortFreq(int [] A, int l){
		int []B=new int [maxInA(A)+1];
		for(int i=0; i<l; i++){
				B[A[i]]++;
		}
		
		int []b=findMin(A, B, 0);
		for(int i=0; i<l; i++){
			System.out.print(b[i]+" ");
		}
	}
	
	static int[] findMin(int []A, int []B,int p){
		int l=A.length;
		int lb=B.length;
		
		int k=minInB(B);
		int h;
		int q=l-1;
		while(p<q){
			while(p<l && A[p]==k){
				p++;
			}
			while(A[q]!=k){
				q--;
			}
			if(p>=l){
				return A;
			}
			if(p>=q){
				return findMin(A,B, p);
			} 
			swap(A, p, q);
			p++; q--; 
		}
		
		
		return findMin(A,B, p);
	}
	
	static int maxInA(int []A){
		int l=A.length;
		int max=A[0];
		for(int i=1; i<l; i++){
			if(max<A[i]){
				max=A[i];
			}
		}
		return max;
	}
	
	static  void swap(int []A, int a, int b){
		int temp=A[a];
		A[a]=A[b];
		A[b]=temp;
		
	}
	
	static int minInB(int [] B){
		
		int lb=B.length; 
		int min=B[1], minPos=1;
		for(int i=2; i<lb; i++){
			if(B[i]!=0){
				if(min>B[i]){
					min=B[i];
					minPos=i;
				}
			}
		}
		B[minPos]=0;
		
		return minPos;
	}
}
