/*Majority Element: A majority element in an array A[] of size n 
is an element that appears more than n/2 times
*/
package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityEle {

	public static void main(String [] Args){
		int []A={2, 2, 4, 2, 4, 4, 2, 4, 4};
		int n=A.length;
		majEle(A, n);
	}
	
	static void majEle(int []A, int n){
		HashMap<Integer, Integer> aMap=new HashMap<Integer, Integer>();
		for(int a:A){
			int val=0;
			if(aMap.containsKey(a)){
				val=aMap.get(a);
			}
			val++;
			aMap.put(a, val);
		}
		
		Iterator it = aMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry ele=(Entry) it.next();
			int key=(int) ele.getKey();
			int freq=(int) ele.getValue();
			if(freq>n/2){
				System.out.println("(key= "+key+" freq= "+freq+" ) ");
			}
		}
	}
}
