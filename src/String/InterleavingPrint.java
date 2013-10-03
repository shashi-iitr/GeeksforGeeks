//Print all interleavings of given two strings AB-CD=ABCD, ACBD, ACDB, CDAB, CADB, CABD.

package String;

public class InterleavingPrint {

	public static void main(String[] args){
		String s1="ab";
		String s2="cd";
		
	}
	
	static void intStr(String s1, String s2){
		int ls1=s1.length();
		int ls2=s2.length();
		String s3=new String();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		char[] ch3=new char[ls1+ls2];
		
		strInt(ch1, ch2, ch3, ls1, ls2, 0);
	}
	
	static void strInt(, char[] ch2, char[] ch3, int ls1, int ls2, int i){
		if(ls1==0 && ls2==0){
			
		}
		
		if(ls1!=0){
			ch3[i]=ch1[0];
			strInt(ch1, ch2, ch3, ls1-1, ls2, i+1);
		}
	}
}
