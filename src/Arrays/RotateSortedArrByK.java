package Arrays;

public class RotateSortedArrByK {

	public static void main(String [] args){
		int []A={1,2,3,4,5,6,7};
		int k=4;
		int [] b=rotateArr(A, k);
		for(int i:b){
			System.out.print(i+" ");
		}
	}
	
	
	static int [] rotateArr(int []A, int k){
		int j=0, l=A.length;
		while(j<l-k){
			swap(A, j, j+k);
			j++;
		}
		int i=j;
		while(i<l-1 && A[i]<A[i+1]){
			i++;
		}
		if(i==l-1){
			return A;
		} else 
			for(int p=i; p>=j; p--){
				int h=l-1;
				while(p<h){
					swap(A, p,h);
					h--;
				}
				l--;
		}
		return A;
	}
	
	
	static void swap(int []A, int i, int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
	
}
