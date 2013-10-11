package Arrays;

public class FirstRepEle {

	public static void main(String[] args){
		int []A={3,1,2,2,1};
		int b=firstDup(A, A.length);
		System.out.print(b);
	}
	
	static int firstDup(int []A, int l){
		int j=0;
		int maxA=A[0];
		for(int i=1; i<l; i++){
			if(maxA<A[i]){
				maxA=A[i];
			}
		}
		
		int []t=new int [maxA+1];
		while(j<l){
			if(t[Math.abs(A[j])]==0){
				t[Math.abs(A[j])]=j+1;
			} else if(t[Math.abs(A[j])]>0){
				t[Math.abs(A[j])]*=-1;
			} else if(t[Math.abs(A[j])]<0){
				t[j]=t[j];
			}
			j++;
		}
		
		int k=1;
		while(t[k]>0){
			k++;
		}
		int f=k;
		int max=t[k];
		for(int h=k+1; h<=maxA ; h++){
			if(t[h]<0){
				if(t[h]>max){
					max=t[h];
					f=h;
				}
			}
		}
		return f;
	}
}
