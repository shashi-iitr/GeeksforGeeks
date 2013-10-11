package String;

public class WindowStr {

	public static void main(String [] args){
		String S="acbbabca";
		String T="aba";
		winStr(S, T);
		
	}
	
	static void winStr(String S, String T){
		int [] AT=new int [26];
		int lt=T.length();
		int ls=S.length();
		for(int i=0; i<lt; i++){
			AT[T.charAt(i)-'a']++;
		}
		int i=0, k=0, count=0;
		while(i<ls && count<3){
			if(AT[S.charAt(i)-'a']>0){
				count++;
				AT[S.charAt(i)-'a']--;
			}
			i++;
		}
		for(int j=0; j<lt; j++){
			AT[T.charAt(j)-'a']++;
		}
		while(i<ls){
			while(AT[S.charAt(i)-'a']<1){
				i++;
			}
			while(k<i){
				while(AT[S.charAt(k++)-'a']>0){
					 int countNew=0;
					 for(int h=k-1; h<=i;h++){
						if( AT[S.charAt(h)-'a']>0){
							countNew++;
							
						}
						//AT[S.charAt(h)-'a']--;
						
					 }
					 if(countNew==lt){
						 System.out.print(i-k+1+" i= "+i+" k= "+k);
						 return;
						 
					 }
					 for(int j=0; j<lt; j++){
							AT[j]=0;
							
						 }
					 for(int j=0; j<lt; j++){
						
						AT[T.charAt(j)-'a']++;
					 }
					 
				}
			}
			k=0;
			i++;
			
		}
	}
	
	/*static boolean countAT(int [] AT){
		for(int i=0; i<26; i++){
			if(AT[i]!=0){
				return false;
			}
			
		}
		return true;
	}*/
}
