package Arrays;

public class KthSmallestEle {

	public static void main(String[] args){
		int []A={42,55,13,88,21,76,49};
		int l=A.length, k=4;
		kLargestEle(A, l, k);
		System.out.println();
		kSmallestEle(A, l, k);
		System.out.println();
		int b=kthSmallBrute(A, l, k);
		System.out.println(b);
	}
	
	//O(n-k)*k
	static void kLargestEle(int []A, int l, int k){
		for(int j=k; j<l; j++){
			int min=A[0], t=0;
			for(int i=1; i<k; i++){
				if(min>A[i]){
					min=A[i];
					t=i;
				}
			}
			if(A[j]>min){
				swap(A, t, j);
			}
		}
		for(int i=0; i<k; i++){
			System.out.print(A[i]+" ");
		}
	}
	
	static void kSmallestEle(int []A, int l, int k){
		for(int j=k; j<l; j++){
			int max=A[0], t=0;
			for(int i=1; i<k; i++){
				if(max<A[i]){
					max=A[i];
					t=i;
				}
			}
			if(A[j]<max){
				swap(A, t, j);
			}
		}
		for(int i=0; i<k; i++){
			System.out.print(A[i]+" ");
		}
	}
	
	static void swap(int []A,int a, int b){
		int t=A[a];
		A[a]=A[b];
		A[b]=t;
	}
	
	
	// O(n*k)
	static int kthSmallBrute(int []A, int l, int k){
		int min=0;
		for(int i=1; i<=k; i++){
			int j=0,  t=0;
			while(A[j]<0){
				j++;
			}
			min=A[j];
			for(int h=j; h<l; h++){
				if(A[h]>0){
					if(min>A[h]){
						min=A[h];
						t=h;
					}
				}
			}
			A[t]*=-1;
		}
		return min;
	}
}
