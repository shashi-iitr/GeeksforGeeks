// check if palindrome

package Arrays;

public class Palindrome {

	public static void main(String[] args){
		int c=123321;
		if(palindrome(c)){
			System.out.print("yes");
		} else
			System.out.print("nah");
	}
	
	static boolean palindrome(int b){
		int a=b;
		int d=a;
		int count=0;
		while(a>0){
			a=a/10;
			count++;
		}
		int []A=new int [count];
		int i=0;
		while(d>0){
			A[i]=d%10;
			d=d/10;
			i++;
			
		}
		int s=0;
		for(int j=0; j<count; j++){
			s=s*10+A[j];
		}
		
		if(s!=b){
			return false;
		}
		return true;
	}
}
