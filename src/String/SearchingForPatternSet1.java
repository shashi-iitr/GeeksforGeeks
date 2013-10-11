package String;

public class SearchingForPatternSet1 {

	public static void main(String[] args){
		String S="AABAACAADAABAAABAA";
		String S1="AABA";
		searchStr(S, S1);
	}
	
	
	static void searchStr(String S, String S1){
		int ls=S.length();
		int ls1=S1.length();
		int i=0, j=0;
		while(i<ls-1){
			int count=0;
			while(j<ls1 && i<ls){
				if(S1.charAt(j++)==S.charAt(i++)){
					count++;
					if(count==ls1){
						System.out.print(i-count+" ");
						j=0;i=i-count+1; count=0; 
					}
					
				}else {
					count=0;
					j=0;
				}
			}
		}
	}
}
