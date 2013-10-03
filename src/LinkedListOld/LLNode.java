package LinkedListOld;

public class LLNode {

	private int data;
	private LLNode Next;
	
	public LLNode(int data){
		this.data=data;
	}
	
	
	
	public void setData(int data){
		this.data=data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setNext(LLNode Next){
		this.Next=Next;
	}
	
	public LLNode getNext(){
		return this.Next;
	}

	
}
