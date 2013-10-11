// Print all the duplicates in the input string.

package String;

public class PrintDupChars {

	public static void main(String [] args){
		String S="shaddkjhdkhdkjdqlkjskshi";
		printDup(S);
	}
	
	static void printDup(String S){
		int []A=new int [26];
		int ls=S.length();
		for(int i=0; i<ls; i++){
			A[S.charAt(i)-'a']++;
		}
		for(int i=0; i<26; i++){
			if(A[i]>1){
				System.out.println(MaxOccuringCharInString.asciiToChar(i+'a')+" count= "+A[i]);
			}
		}
	}
}
	
