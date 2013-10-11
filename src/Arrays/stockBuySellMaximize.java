// Stock Buy Sell to Maximize Profit


package Arrays;

public class stockBuySellMaximize {

	public static void main(String[] args){
		int [] A={7,6,5,4,3,100, 180, 260, 910, 40, 535, 695, 34, 290};
		int l=A.length;
		
		stock(A, l);
		System.out.println();
		stockMax(A, l);
		System.out.println();
		stockMaxN2(A, 0, l);
		
		
		
	}
	
	static void stock(int []A, int l){
		int profit=0, bdi=0, sdi=0;
		for(int i=1; i<l; i++){
			for(int j=i; j<l; j++){
				if(A[j]-A[i]>profit){
					profit=A[j]-A[i];
					bdi=i;
					sdi=j;
					
				}
			}
		}
		System.out.println(bdi +" "+sdi);
		
	}
	
	
	//O(n)
	static void stockMax(int []A, int l){
		int i=0, c=0;
		while(i<l-1){
			while(i<l-1 && A[i]>A[i+1]){
				i++;
			}
			if(i==l-1){
				break;
			}
			System.out.print("buy @= "+i+"  ");
			while(i<l-1 && A[i]<A[i+1]){
				i++;
			}
			System.out.println("sell @= "+i);
			c++;
		}
		
		if(c==0){
			System.out.print("no buy and sell is suitable");
		}
	}
	
	
	
	//n^2
	static void stockMaxN2(int []A, int i, int l){
		int j=i;
		if(i==l){
			System.exit(0);
		}
		if(decStock(A, A.length)){
			System.out.print("no suitable stock to buy and sell");
		} else {
			while(i<l-1 && A[i]<A[i+1]){
				i++;
			}
			if(A[j]<A[i]){
				System.out.println("buy = "+A[j]+" - on day= "+j+"  &  sell= "+A[i]+" - on day= "+i);	
			}
			stockMaxN2(A, i+1, l);
		}
	}
	
	static boolean decStock(int [] A, int l){
		int i=0;
		while(i<l-1){
			if(A[i]<A[i+1]){
				return false;
			}
			i++;
		}
		return true;
	}
}
