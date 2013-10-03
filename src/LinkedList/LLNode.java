package LinkedList;

public class LLNode {

	private Object data;
	private LLNode Next;
	
	public LLNode(Object data){
		this.data=data;
		this.Next=null;
	}
	public LLNode(){
		this.data=null;
		this.Next=null;
	}
	
	public void setData(Object data){
		this.data=data;
	}
	
	public Object getData(){
		return data;
	}
	
	public void setNext(LLNode Next){
		this.Next=Next;
	}
	
	public LLNode getNext(){
		return this.Next;
	}

	
}
