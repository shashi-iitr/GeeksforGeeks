package String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PermutStr {

	public static void main(String[] args){
		char [] ch={'a','b','c','d'};
		permStr(ch);
		
	}
	
	static void permStr(char[] ch){
		int l=ch.length;
		List<String> s1=new ArrayList<String>();
		s1.add("");
		List<String> s2=new ArrayList<String>();
		
		for(int i=0; i<l; i++){
			for(String s:s1){
				s2.addAll(sAppend(s,ch[i]));
			}
			s1=s2;
			s2=null;
		}
		System.out.print(s1);
	}
	
	public static List<String> sAppend(String s, char c){
		
		
		return null;
	}
}
