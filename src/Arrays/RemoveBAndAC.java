//Remove “b” and “ac” from a given string

package Arrays;

public class RemoveBAndAC {

	public static void main(String [] args){
		String S="acacbahcacb";
		
		String b=remACnB(S);
		System.out.print("b= "+b);
		
		String a=remBnAC(S);
		System.out.println("a= "+a);
	}
	
	
	static String remBnAC(String S){
		String c="";
		StringBuffer sb=new StringBuffer();
		
		int l=S.length();
		int i=0;
		while(i<=l-1){
			if(S.charAt(i)=='b' || (S.charAt(i)=='a' && S.charAt(i+1)=='c')){
				if((S.charAt(i)=='a' && S.charAt(i+1)=='c')){
					i++;
				}
				i++;
			} else{ 
				sb=sb.append(S.charAt(i));
				c=c+S.charAt(i);
				i++;
			}
		}
		System.out.println("\nsb= "+sb);
		return c;
	}
	
	
	
	static String remACnB(String S){
		int l=S.length();
		int i=0;
		int []A=new int [l];
		while(i<=l-1){
			if(S.charAt(i)=='a'){
				if(S.charAt(i+1)=='c'){
					A[i]++;
					A[i+1]++;
				}
			}
			if(S.charAt(i)=='b'){
				A[i]++;
			}
			i++;
		}
		String p="";
		for(int j=0; j<l; j++){
			if(A[j]==0){
				p=p+S.charAt(j);
			}
		}
		return p;
	}
}
