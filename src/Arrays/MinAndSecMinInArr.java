package Arrays;

public class MinAndSecMinInArr {

	public static void main(String[] args){
		int []A={13,5,19,48,98,14,67,0};
		minAndSecMin(A);
	}
	
	static void minAndSecMin(int []A){
		int min=A[0];
		int l=A.length;
		int i=1;
		while(i<l){
			if(min>A[i]){
				min=A[i];
			}
			i++;
		}
		int j=1, secMin=A[0];
		if(min==A[0]){
			secMin=A[1];
		}
		while(j<l){
			 
			if(secMin>A[j]){
				if(A[j]==min){
					if(j==l-1){
					System.out.println(min);
					System.out.println(secMin);
						return;
					} else
						j++;
				}if(secMin>A[j] && A[j]!=min){
					secMin=A[j];
				} 
			}
			j++;
		}
		System.out.println(min);
		System.out.println(secMin);
	}
}
