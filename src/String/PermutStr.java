package String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PermutStr {

	public static void main(String[] args){
		List<String> allString =new ArrayList<String>();
		allString.add(" ");
		int len=0;
		String S="abc";
		char [] chs=S.toCharArray();
		for(char ch:chs){
			List<String> temp=new ArrayList<String>();
			for(String s: allString){
				int[] A;
				if(len==0){
					temp.add(chs.toString());
				} else{
					A=new int [len+1];
							
				}
				
			}
		}
		
	}
}
