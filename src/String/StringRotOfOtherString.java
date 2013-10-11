//A Program to check if strings are rotations of each other or not

package String;

import Arrays.SubsetArr;

public class StringRotOfOtherString {

	public static void main(String [] args){
		String S="shashi";
		String S1="shisha";
		if(strRot(S, S1)){
			System.out.print("rotated");
		}else System.out.print("not rotated");
	}
	
	static boolean strRot(String S, String S1){
		int ls=S.length();
		int ls1=S1.length();
		if(ls!=ls1){
			return false;
		}
		S=S.concat(S);
		if(S.contains(S1)){
			return true;
		} else return false;
	}
	
	
}
