package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class GivenEleForMajorityEle {

	public static void main(String[] args){
		int[]A={2, 2, 3, 3, 3, 3, 10};
		int x=3, l=A.length;
		int j=searchEleX(A, 0, l-1, x);
		if(j==-1){
			System.out.println("x is not a major element");
		}
		if(isExistX(A, j, l-1, x)){
			System.out.println("x is major element");
		} else
			System.out.println("x is not a major element");
		
		if(xMajor(A, x, l-1)){
			System.out.println("x is major element");
		} else
			System.out.println("x is not a major element");
		
		
	}
	
	static boolean isExistX(int []A, int i, int l, int x){
		int k=i+l/2-1;
		if(k<=l && A[k]==x){
			return true;
		} else
			return false;
	}
	
	static int searchEleX(int [] A, int i, int l, int x){
		int mid=(i+l)/2;
		if(i<0 || l<0 || l<i){
			return -1;
		}
		if(A[mid]==x){
			return mid;
		} else if(A[mid]<x){
			return searchEleX(A, mid+1, l, x);
		}
		else
			return searchEleX(A, i, mid-1, x);
	}
	
	
	//O(n)
	static boolean xMajor(int [] A, int x, int l){
		HashMap<Integer, Integer> aMap=new  HashMap<Integer,Integer >();
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
			int value=(int) ele.getValue();
			int key=(int) ele.getKey();
			if(key==x && value>l/2){
				return true;
			}
		}
		return false;
		
	}
}
