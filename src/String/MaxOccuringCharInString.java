//Return maximum occurring character in the input string

package String;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MaxOccuringCharInString {

	public static void main(String[] args){
		String S="tesrrt Strinrg";
		/*char c=maxOccurChar(S);
		System.out.println(c);*/
		char b=maxOccur(S);
		System.out.println(b);
	}
	
	
	static char maxOccur(String S){
		int []A=new int[256];
		int ls=S.length();
		int i=0;
		 while(i<ls){
			 A[(S.charAt(i))]++;
			 
			 i++;
		 }
		 int max=A[0], t=0;
		 for(int j=1; j<256; j++){
			 if(max<A[j]){
				 max=A[j];
				 t=j;
			 }
		 }
		 return asciiToChar(t);
	}
	
	static int charToAscii(char ch){
		int a=ch;
		return a;		
	}
	
	static char asciiToChar(int i){
		char a=(char) i;
		return a;
	}
	
	
	
	static char maxOccurChar(String S){
		HashMap<Character, Integer> sMap=new HashMap<Character, Integer>();
		int i=0, v=0;
		for(int a: S.toCharArray()){
			v=0;
			if(sMap.containsKey(S.charAt(i))){
				v=sMap.get(a);
			}
			i++;
			v++;
			sMap.put((char) a, v);
		}
		
		HashMap<Character, Integer> countHash = null;
		int max = Collections.max(countHash.values());
		char key=0;
		java.util.Iterator<Entry<Character, Integer>> it=sMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry countCh= it.next();
			key= (char) countCh.getKey();
			int val=(int) countCh.getValue();
			if(val==max){
				key=(char) countCh.getKey();
			}
		}
		return key;
	}
}
