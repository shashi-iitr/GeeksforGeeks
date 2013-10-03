package String;

public class PermStr {

	public static void main(String[] args){
		String S="ABC";
		StringBuffer Sb=new StringBuffer(S);
		permStr(Sb, Sb.length());
	}
	
	static void permStr(StringBuffer Sb, int I){
		if(I==0){
			System.out.println(Sb);
		} else {
			permStr(Sb, I-1);
			int currPos=Sb.length()-I;
			for(int i=currPos+1; i<Sb.length(); i++){
				swap(Sb, currPos, i);
				permStr(Sb, I-1);
				swap(Sb, i, currPos);
			}
		}
	}
	
	static void swap(StringBuffer Sb, int i, int j){
		char t=Sb.charAt(i);
		Sb.setCharAt(i, Sb.charAt(j));
		Sb.setCharAt(j, t);
	}
}

