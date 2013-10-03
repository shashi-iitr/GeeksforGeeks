package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ConsecutiveEle {

	public static void main(String[] args){
		int []A={80, 78, 77, 81, 81, 79};
		if(cons(A)){
			System.out.print("true");
		} else System.out.print("false");
		
		System.out.println();
		if(conse(A)){
			System.out.print("true");
		} else System.out.print("false");
	}
	
	
	static boolean conse(int []A){
		HashMap<Integer, Integer> aMap=new HashMap<Integer, Integer>();
		int val=0;
		for(int a:A){
			val=0;
			if(aMap.containsKey(a)){
				val=aMap.get(a);
			}
			val++;
			aMap.put(a, val);
		}
		
		Iterator it=aMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry ele=(Entry) it.next();
			val=(int) ele.getValue();
		}
		
		for(int a:A){
			if(aMap.containsKey(a+1) && val!=1){
				return false;
			}
		}
		return true;
	}
	
	
	static boolean cons(int []A){
		int la=A.length;
		int maxA=max(A, la);
		int minA=min(A,la);
		
		if(minA+la-1!=maxA){
			return false;
		} else{
			int []B=new int [la];
			for(int i=0; i<la; i++){
				B[A[i]-minA]++;
			}
			for(int i=0; i<la; i++){
				if(B[i]!=1){
					return false;
				}
			}
		}
		return true;
	}
	
	
	static int min(int []A, int la){
		int min=A[0];
		for(int i=1; i<la; i++){
			if(min>A[i]){
				min=A[i];
			}
		}
		return min;
	}
	
	
	static int max(int []A, int la){
		int max=A[0];
		for(int i=1; i<la; i++){
			if(max<A[i]){
				max=A[i];
			}
		}
		return max;
	}
}
