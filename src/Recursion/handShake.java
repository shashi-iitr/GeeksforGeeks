package Recursion;

public class handShake {

	public static void main(String[] args){
		long n=6;
		long b=handShake(n);
		System.out.println(b);
		
		long c=handShakeNCouple(n);
		System.out.println(c);
		
		long d=fibR(n);
		System.out.println(d);
		
		long e=fibDP(n);
		System.out.println(e);
		
		long f=fact(n);
		System.out.println(f);
	
	}
	
	
	static long handShake(long n){
		if(n==1)
			return 0;
		return (n-1)+ handShake(n-1);
	}
	
	
	static long handShakeNCouple(long n){
		if(n==2)
			return 0;
		return (n-2)+handShakeNCouple(n-2);
	}
	
	
	static long fibR(long n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibR(n-1)+ fibR(n-2);
	}
	
	
	static long fibDP(long n){
		long [] A=new long [(int) n];
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(A[(int) n-1]!=0)
			return A[(int) n-1];
		A[(int) n-1]=fibDP(n-1)+fibDP(n-2);
		return A[(int) n-1];
	}
	
	
	static long fact(long n){
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
}
