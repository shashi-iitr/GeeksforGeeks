//Remove characters from the first string which are present in the second string


package String;

public class RemoveDupCharIfPresentInOtherString {

	public static void main(String[] args){
		String S="gurgaon noida";
		System.out.println(S);
		String c=remCharOrderMaintain(S);
		System.out.println(c);
	}
	
	
	static String remCharOrderMaintain(String S){
		int l=S.length();
		int []A=new int [26];
		String s="";
		String []S1=S.split(" ");
		String s1=S1[0];
		String s2=S1[1];
		int ls1=s1.length();
		int ls2=s2.length();
		int i=0;
		while(i<ls2){
			A[s2.charAt(i)-'a']++;
			i++;
		}
		int j=0;
		while(j<ls1){
			if(A[s1.charAt(j)-'a']==0){
				s+=s1.charAt(j);
			}
			j++;
		}
		return s;
	}
}
