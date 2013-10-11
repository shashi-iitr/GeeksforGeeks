package Arrays;

public class MaxDupEle {

	public static void main(String[] Args){
		int []S={1,2,2,3,3,3,4,5,5,6,6,6,6,7,7,7,7,7};
		int b=maxDup(S, S.length);
		System.out.print(b);
	}
	
	static int maxDup(int []A, int l){
		int i=0, max=0, t=0;;
		while(i<l-1){
			int c=1;
			while(i<l-1 && A[i]==A[i+1]){
				c++;
				i++;
			}
			if(c>max){
				max=c;
				t=i;
			}
			i++;
		}
		return A[t];
	}
}
