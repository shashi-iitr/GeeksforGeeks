//Find the Number Occurring Odd Number of Times

package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OddOccuranceEle {

	public static void main(String[] args){
		int []A={2,3,4,2,3,3,2,4,4,3,2,1,2,3,4,5,7};
		int l=A.length;
		oddOccuranceHash(A);
		System.out.println();
		oddFreq(A, l);
	}
	
	
	static void oddOccuranceHash(int []A){
		HashMap<Integer, Integer> aMap=new HashMap<Integer, Integer>();
		for(int a:A){
			int value=0;
			if(aMap.containsKey(a)){
				value=aMap.get(a);
			}
			value++;
			aMap.put(a, value);
		}
		Iterator it = aMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();
			int key= (int) pairs.getKey();
			int val=(int) pairs.getValue();
			if(val%2!=0){
				System.out.print(key+" ");
			}
		}
	}

	
	// more space
	static void oddFreq(int []A, int l){
		int max=A[0];
		for(int i=1; i<l; i++){
			if(max<A[i]){
				max=A[i];
			}
		}
		
		int []B=new int [max+1];
		for(int i=0; i<l; i++){
			B[A[i]]+=1;
		}
		
		for(int i=0; i<=max; i++){
			if(B[i]%2!=0){
				System.out.print(i+" ");
			}
		}
	}

}
