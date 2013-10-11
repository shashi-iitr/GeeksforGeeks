 /*given an array of n+2 elements. All elements of the array are in range 1 to n. 
 And all elements occur once except two numbers which occur twice. Find the two repeating numbers.
*/

package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatTwoEle {

	public static void main(String[] args){
		int []A={1,3,6,5,5,8,7,2,4,7};
		repEle(A);
		System.out.println();
		repEleHash(A);
		System.out.println();
		repEle1Space(A);
	}
	
	static void repEle1Space(int []A){
		int l=A.length;
		for(int i=0; i<l; i++){
			if(A[Math.abs(A[i])]>0){
				A[Math.abs(A[i])]*=-1;
			} else if(A[Math.abs(A[i])]<0){
				A[Math.abs(A[i])]*=-1;
			}
		}
		
		for(int j=1; j<l-1; j++){
			if(A[j]>0){
				System.out.print(j+" ");
			}
		}
	}
	
	static void repEleHash(int []A){
		HashMap<Integer, Integer> aMap=new HashMap<Integer, Integer>();
		for(int a:A){
			int val=0;
			if(aMap.containsKey(a)){
				val=aMap.get(a);
			}
			val++;
			aMap.put(a, val);
		}
		
		Iterator it=aMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry ele=(Entry) it.next();
			int val=(int) ele.getValue();
			int key=(int) ele.getKey();
			if(val>1){
				System.out.print(key+" ");
			}
		}
	}
	
	
	
	static void repEle(int []A){
		int l=A.length;
		int []B=new int [l-1];
		int i=0;
		while(i<l){
			B[A[i]]++;
			i++;
		}
		int j=1;
		while(j<l-1){
			if(B[j]>1){
				System.out.print(j+", ");
			}
			j++;
		}
	}
}
