package Arrays;

public class AdjEleSumClosestToZero {

	public static void main(String[] args){
		int []A={-2,-83, 60, -10, 5,-8, 70, 81, 85, 1};
		adjSumCloseToZero(A);
	}
	
	static void adjSumCloseToZero(int []A){
		int l=A.length;
		if(l==1){
			return;
		}
		int sum=0, sumMin=A[0]+A[1], count=0;
		for(int i=0; i<l-1; i++){
			sum=A[i]+A[i+1];
			if(sum==0){
				System.out.print("("+A[i]+", "+A[i+1]+") ");
				return;
			}
			if(Math.abs(sum)<Math.abs(sumMin)){
				sumMin=sum;
				count=i;
			}
		}
		System.out.print("("+A[count]+", "+A[count+1]+") ");
	}
}
