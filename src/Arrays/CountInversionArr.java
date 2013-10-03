package Arrays;

public class CountInversionArr {

	public static void main(String[] args){
		int []A={ 5,4,6,7,2,1,3};
		countRevArr(A);
	}
	
	
	static void countRevArr(int []A){
		int l=A.length;
		for(int i=0; i<l-1; i++){
			for(int j=i; j<l; j++){
				if(A[i]>A[j] && i<j){
					System.out.print("("+A[i]+" "+A[j]+") ");
				}
			}
		}
	}
}
