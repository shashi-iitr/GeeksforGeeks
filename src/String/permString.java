package String;

public class permString {

	public static void main(String[] args){
		char []A={'a','k','m'};
		permStr(A, 0, A.length-1);
	}
	
	static void permStr(char[]A, int i, int l){
		
		if(i==l){
			printArr(A, A.length);
			
		} else {
			for(int k=i; k<=l; k++){
				swap(A, i, k);
				permStr(A, i+1, l);
				swap(A, i, k);
			}	
		}
	}
	
	static void swap(char [] ch, int i, int j){
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
	}
	
	static void printArr(char [] A, int l){
		for(int i=0; i<l; i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
}
