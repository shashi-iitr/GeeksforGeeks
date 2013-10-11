// incomplete

package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class KSmallestEle {
	//static List<Integer> s= new ArrayList<Integer>();
	public static void main(String[] args){
		int []A={2,5,6,1,7,4,3,9};
		int k=4, l=A.length;
		List<Integer> b=kSmallestEle(A, 0, l-1, k);
		for(Integer i:b){
			System.out.print(i+" ");
		}
	}
	
	static List<Integer> kSmallestEle(int []A, int low, int high, int k){
		int p=partition(A, low, high);
		
		if(p==low+k){
			List<Integer> l=listConv(A, low, p);
			return l;
		} else if(p>low+k){
			return kSmallestEle(A, low, p, k);
		} else {
			 List<Integer> s=listConv(A, low, p);
			if(p==0){
				s.addAll(kSmallestEle(A, p+1, high, k-p-1));
			} else
				s.addAll(kSmallestEle(A, p+1, high, k-p));
			return s;
		}
	}
	
	static List<Integer> listConv(int []A, int low, int high){
		List<Integer> l=new ArrayList<Integer>();
		for(int i=low; i<=high; i++){
			l.add(A[i]);
		}
		return l;
	}
	
	static int partition(int []A, int low, int high){
		int p=A[low], i=low, j=high;
		while(i<j){
			while(A[i]<=p && i<high){
				i++;
			}
			while(A[j]>p){
				j--;
			}
			if(i<j){
				KthLargestSmallestInArr.swap(A, i, j);
			}
		}
		A[low]=A[j];
		A[j]=p;
		return j;
	}
	
	/*static void swap(int []A, int i, int j){
		int t=A[i];
		A[i]=A[j];
		A[j]=t;
	}*/
}
