
public class PermutStringBackTracking {

	public static void main(String[] args){
		String S="abc";
		char[] ch=S.toCharArray();
		perm(ch, 0, S.length()-1);
	}
	
	
	static void perm(char[] ch, int i, int l){
		if(i==l){
			for(char s: ch){
				System.out.print(s);
			}
			System.out.println();
		} else
			for(int k=i; k<=l; k++){
				swap(ch, i, k);
				perm(ch, i+1, l);
				swap(ch, i, k);
			}
	}
	
	
	static char [] swap(char[] ch, int i, int j){
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
		return ch;
	}
	
}