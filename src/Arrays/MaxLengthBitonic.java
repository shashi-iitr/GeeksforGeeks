/*Given an array A[0 ... n-1] containing n positive integers, 
a subarray A[i ... j] is bitonic if there is a k with A[i] < = k = A[j].
*/

package Arrays;

public class MaxLengthBitonic {

	public static void main(String[] args){
		int []A={4,1,5,6,2,1,3,4,5,7,8,6};
		bitonicLen(A);
		
		System.out.println();
		maxLen(A);
	}
	
	static void bitonicLen(int []A){
		int l=A.length;
		int i=0, count=0, len=0, j=0, t=0;
		while(i<l-1){
			while(i<l-1 && A[i]>A[i+1]){
				i++;
			}
			if(count==0 && i==l-1){
				System.out.print("i= "+i+ " "+j);
				System.out.print("A[t]= "+A[t]);
				break;
			} else if(count!=0 && i==l-1){
				System.out.print(len+ " "+j);
				System.out.print("A[t]= "+A[t]);
				break;
			}
			j=i;
			
			while(i<l-1 && A[i]<A[i+1]){			
				i++;
			}
			if(count==0 && i==l-1){
				System.out.print("i-j+1= "+(i-j+1)+" "+j);
				System.out.print("A[t]= "+A[t]);
				break;
			} else if(count!=0 && i==l-1){
				System.out.print(len+" "+j);
				System.out.print("A[t]= "+A[t]);
				break;
			}
			t=i;
			
			while(i<l-1 && A[i]>A[i+1]){
				i++;
			}
			count=i-j+1;
			if(count>len){
				len=count;
			}
			i++;
		}
		
		if(i==l){
			System.out.println("len= "+len+" "+j);
			System.out.print("A[t]= "+A[t]);
		}
	}
	
	
	
	static void maxLen(int []A){
		int l=A.length;
		int []Inc=new int [l];
		int []Dec=new int [l];
		int count=1; Inc[0]=1;
		
		for(int i=1; i<l; i++){
			if(A[i]>A[i-1]){
				count++;
			}
			Inc[i]=count;
		}
		int countD=1; Dec[l-1]=1;
		for(int i=l-2; i>=0; i--){
			if(A[i]>A[i+1]){
				countD++;
			}
			Dec[i]=countD;
		}
		
		for(int i=0; i<l; i++){
			Inc[i]=Inc[i]+Dec[i]-1;
		}
		int max=Inc[0], j=0;
		for(int i=1; i<l; i++){
			if(max<Inc[i]){
				max=Inc[i];
				j=i;
			}
		}
		
		System.out.print(max+" "+A[j]);
	}
}
