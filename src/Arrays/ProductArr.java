package Arrays;

public class ProductArr {

	public static void main(String[] args){
		int []A={2,7,5,6,4,3};
		prodArrByDivisionOpr(A);
	}
	
	static void prodArrByDivisionOpr(int []A){
		int pro=1, l=A.length;
		for(int i=0; i<l; i++){
			pro*=A[i];
		}
		
		for(int i=0; i<l; i++){
			System.out.print(pro/A[i]+" ");
		}
	}
	
}
