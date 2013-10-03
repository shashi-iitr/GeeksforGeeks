package LinkedListOld;

public class LLMidNode {

	private int data;
	private LLMidNode Next;
	
	public LLMidNode(int data){
		this.data=data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setNext(LLMidNode Next){
		this.Next=Next;
	}
	
	public LLMidNode getNext(){
		return this.Next;
	}
	
	
	void midNode(LLMidNode head, LLMidNode f, LLMidNode s){
		
		if(head==null){
			System.out.print("Stack underflow");
			return;
		}
		
		while(f.Next!=null && f.Next.Next!=null){
			f=f.Next.Next;
			s=s.Next;
		}
		
		System.out.print(s.getData()+"  "+ f.getData());
	}
	
}
