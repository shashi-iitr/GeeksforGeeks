
public class MaxRepeatingElement {

	public static void main(String[] args){
		int[] A={2, 3, 3, 5, 3, 4, 1, 7};
		int l=A.length;
		maxRepeatEleOkSpace(A, l);   // complete
		//maxRepeatEleO1Space(A, l);    not complete
	}
	
	static void maxRepeatEleOkSpace(int [] A, int l){
		int max=A[0];
		for(int i=1; i<l; i++){
			if(max<A[i])
				max=A[i];
		}
		int []B= new int[max+1];
		for(int j=0; j<l; j++){
			B[A[j]]+=1;
		}
		int max1=B[0], count=0;
		for(int i=1; i<max; i++){
			if(max1<B[i]){
				max1=B[i];
				
			}
		}
		int j=0;
		while(B[j]!=max1){
			count++;
			j++;
		}
		System.out.print(count+" "+max1+" "+max);	
	}
	
	
	
	static void maxRepeatEleO1Space(int []A, int l){
		for(int i=0; i<l; i++){
			A[i]=A[A[i]%l]+l;
			System.out.print(A[i]+" ");
		}
		int max2=A[0];
		for(int i=1; i<l; i++){
			if(max2<A[i])
				max2=A[i];
		}
		int j=0, count=0;
		while(A[j]!=max2){
			count++;
			j++;
		}
		for(int i=0; i<l; i++){
			A[i]=A[i]%l;
		}
		System.out.println();
		System.out.print(count);
		System.out.println();
		for(int i=0; i<l; i++)
			System.out.print(A[i]+" ");
	}
}
