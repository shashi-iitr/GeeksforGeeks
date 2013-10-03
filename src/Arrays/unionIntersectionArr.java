//Union and Intersection of two sorted arrays

package Arrays;

public class unionIntersectionArr {
	public static void main(String [] args){
		int []A={1,3,5,6,7,8,9};
		int []B={2,3,6};
		int la=A.length;
		int lb=B.length;
		uniInt(A, la, B, lb);
		
	}
	
	static void uniInt(int []A, int la, int []B, int lb){
		int []C=new int [max(A[la-1],B[lb-1])+1];
		for(int i=0; i<la; i++){
			C[A[i]]++;
		}
		for(int j=0; j<lb; j++){
			C[B[j]]++;
		}
		int dubCount=0;
		System.out.print("intersection= ");
		for(int i=0; i<C.length; i++){
			if(C[i]>1){
				System.out.print(i+" ");
				dubCount++;
			}
		}
		int ld=la+lb-dubCount;
		int []D=new int [ld];
		int i=0, j=0, k=0;
		while(i<la && j<lb){
			if(A[i]>B[j]){
				D[k++]=B[j];
				j++;
			} else if(A[i]<B[j]){
				D[k++]=A[i];
				i++;
			} else {
				D[k++]=A[i];
				i++; j++;
			}
		}
		while(i<la){
			D[k++]=A[i];
			i++;
		}
		while(j<lb){
			D[k++]=B[j];
			j++;
		}
		System.out.println();
		System.out.print("union= ");
		for(int g=0; g<ld; g++){
			System.out.print(D[g]+" ");
		}
	}
	
	static int max(int a, int b){
		return a>b?a:b;
	}
}
