//

package String;

public class Anagram {

	public static void main(String[] args){
		String s1="abcd";
		String s2="badc";
		if(isAnagram(s1, s2)){
			System.out.print("yeah");
		} else System.out.print("nah");
	}
	
	static boolean isAnagram(String s1, String s2){
		int ls1=s1.length();
		int ls2=s2.length();
		if(ls1!=ls2){
			return false;
		}
		int []A=new int [26];
		for(int i=0; i<ls1; i++){
			A[s1.charAt(i)-'a']++;
			A[s2.charAt(i)-'a']--;
		}
		for(int i=0; i<ls1; i++){
			if(A[i]!=0){
				return false;
			}
		}
		return true;
	}
}
