package String;

public class RemoveDuplicateFromString {

	public static void main(String [] args){
		String S="geeksforuuyuyuyugeeks";
		String b=removeDup(S);
		System.out.println(b);
		System.out.println(S);
	}
	
	static String removeDup(String S){
		int ls=S.length();
		int []A=new int [26];
		for(int i=0; i<ls; i++){
			if(A[S.charAt(i)-'a']==0){
				A[S.charAt(i)-'a']++;
			} else if(A[S.charAt(i)-'a']>0){
				A[S.charAt(i)-'a']=1;
			}
		}
		String s="";
		for(int i=0; i<26; i++){
			if(A[i]==1){
				s+=MaxOccuringCharInString.asciiToChar(i+'a');
			}
		}
		
		return s;
	}
}
