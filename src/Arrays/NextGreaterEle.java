package Arrays;

public class NextGreaterEle {

	public static void main(String [] args){
		int []A={5,4,25,11,13,17};
		nextGreEle(A);
	}
	
	static void nextGreEle(int []A){
		int i=0, l=A.length, count=0;
		while(i<l-1){
			while(i<l-1 && (A[i]>A[i+1] )){
				i++; count++;
			}
			if(i==l-2){
				System.out.print(-1+" ");
			} else {
				System.out.print(A[i+1]+" ");
				i=i-count;
				count=0;
			}
			i++;
		}
		
	}
}
