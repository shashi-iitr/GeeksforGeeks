package String;

public class RunLengthStringAAIsA2 {

	public static void main(String[] args){
		String S="wwwwaaadexxxxxx";
		String b=runLen(S);
		System.out.print(b);
	}
	
	static String runLen(String S){
		int l=S.length();
		int i=0; 
		String S1="";
		while(i<l-1){
			int count=1;
			while(i<l-1 && S.charAt(i)==S.charAt(i+1)){
				count++;
				i++;
			}
			S1=S1+S.charAt(i)+count;
			i++;
		}
		return S1;
	}
}
