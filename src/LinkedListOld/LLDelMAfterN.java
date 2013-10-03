package LinkedListOld;


public class LLDelMAfterN {

	private int data;
	private LLDelMAfterN Next;

	public LLDelMAfterN(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setNext(LLDelMAfterN Next) {
		this.Next = Next;
	}

	public LLDelMAfterN getNext() {
		return this.Next;
	}
	
	
	void delMAfterN(LLDelMAfterN head, int m, int n){
		if(head==null){
			System.out.print("underflow");
			return;
		}
		
		LLDelMAfterN f=head;
		LLDelMAfterN s= head;
		LLDelMAfterN c= head;
		LLDelMAfterN d= head;
		while(d!=null){
			System.out.print(d.getData()+" ");
			d=d.Next;
		}
		System.out.println();
		int i=1;
		
		while(f!=null && i<m){
			f=f.Next;
			s=s.Next;
			i++;
		}
		
		if(i<m){
			System.out.print("nodes are less that n");
			return;
		}
		
		else if(i==m){
			while(f!=null && i<m+n){
				f=f.Next;
				i++;
			}
			
			if(i<m+n){
				System.out.print("nodes are less that m");
				return;
			}
			
			else if(i==m+n){
				s.setNext(f.Next);
			}
		}
		
		while(c!=null){
			System.out.print(c.getData()+" ");
			c=c.Next;
		}
		
	}
}
