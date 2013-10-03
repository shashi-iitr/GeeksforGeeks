
public class PermutStringBackTracking {

	public static void main(String[] args){
		char[] ch={'A','B','C'};
		int l=ch.length;
		int i=0;
		permString(ch, i, l);	
	}
	
	static void permString(char [] ch, int i, int l){
		
		int j;
		if(i==l){
			System.out.print(ch);
		}
		else{
			for(j=i; j<=l; j++){
				swap(ch, i, j);
				
			}
		}
	}
	static char [] swap(char[] ch, int i, int j){
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
		return ch;
	}
	
}