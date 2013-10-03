package String;

public class ReverseWordsInString {

	public static void main(String[] args){
		String S="my laptop bag hero";
		int i=0, l=S.length();
		char[] ch=S.toCharArray();
		reverseWords(ch, 0, l);
	}
	

	static void reverseWords(char [] ch, int i, int l){
		int j=i;
		if(i>=l){
			String s="";
			for(int k=0; k<l; k++){
				s+=ch[k];
			}
			System.out.print(s);
			return;
		}
		while(i<l && ch[i]!=' '){
			i++;
		}
		int p=i-1;
		int t=p;
		while(j<p){
			swap(ch, j, p);
			j++; p--;
		}
		reverseWords(ch,(t+2),l);
		
	}
	
	static char[] swap(char []ch, int j, int i){
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
		return ch;
	}
}
