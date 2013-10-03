package LinkedListOld;

public class LLIntersectTwoSLL {

	private int data;
	private LLIntersectTwoSLL Next;
	
	public LLIntersectTwoSLL (int data){
		this.data=data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public void setNext(LLIntersectTwoSLL Next){
		this.Next=Next;
	}
	
	public int getData(){
		return data;
	}
	public LLIntersectTwoSLL getNext(){
		return this.Next;
	}
	
	
	void intersectTwoSLL(LLIntersectTwoSLL head1, LLIntersectTwoSLL head2){
		
		LLIntersectTwoSLL cN1=head1;
		LLIntersectTwoSLL h1cN1=head1;
		LLIntersectTwoSLL cN2=head2;
		LLIntersectTwoSLL h2cN2=head2;
		
		cN1=cN1.Next; cN2=cN2.Next;
		
		int i=0, j=0;
		
		while(cN1!=null){
			
			System.out.print(cN1.getData()+" ");
			cN1=cN1.Next;
			i++;
		}
		System.out.println(" length for cN1=  "+i);
		
		while(cN2!=null){
			
			System.out.print(cN2.getData()+" ");
			cN2=cN2.Next;
			j++;
		}
		
		System.out.println(" length for cN2=  "+j);
		
		if(i>j){
			int k=0;
			while(k!=(i-j)){
				k++;
				System.out.print(h1cN1.getData()+" ");
				h1cN1=h1cN1.Next;
			}
			System.out.println();
			
			while(h1cN1!=h2cN2){
				System.out.print("("+h1cN1.getData()+" "+h2cN2.getData()+") ");
				h1cN1=h1cN1.Next;
				h2cN2=h2cN2.Next;
			}
			System.out.print(h1cN1.getData()+"  "+ h2cN2.getData());
		}
		
		else
		{
			int k=0;
			while(k!=(j-i)){
				k++;
				h2cN2=h2cN2.Next;
				System.out.print(h2cN2.getData()+" ");
				
			}
			System.out.println();
			
			while(h1cN1!=h2cN2){
				System.out.print("("+h1cN1.getData()+" "+h2cN2.getData()+") ");
				h1cN1=h1cN1.Next;
				h2cN2=h2cN2.Next;
			}
			System.out.println();
			System.out.print(h1cN1.getData()+"  "+ h2cN2.getData());
		}
	}
}
