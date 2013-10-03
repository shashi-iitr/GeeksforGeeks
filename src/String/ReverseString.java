package String;

public class ReverseString {

	public static void main(String[] args){
		String S="y";
		String b=reverseStr(S);
		System.out.print(b);
	}
	
	static String reverseStr(String S){
		int l=S.length();
		return l<=1? S:( reverseStr(S.substring(l-1))+ reverseStr(S.substring(0, l-1)));
	}
}
