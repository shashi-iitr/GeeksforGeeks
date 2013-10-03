package LinkedListOld;

public class LLNthNode {

	private int data;
	private LLNthNode Next;
	
	public LLNthNode(int data){
		this.data=data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public void setNext(LLNthNode Next){
		this.Next=Next;
	}
	
	public int getData(){
		return data;
	}
	
	public LLNthNode getNext(){
		return this.Next;
	}
	
	
	void nthNode(LLNthNode head , int n){
		
		if(head==null){
			System.out.print("Stack underflow");
		}
		
		LLNthNode currentNode=head;
		int i=0;
		while(currentNode!=null && i<n){
			i++;
			currentNode=currentNode.Next;
		}
		
		if(i<n){
			System.out.print("less nodes from n  "+i);
		}
		
		else
			System.out.print(currentNode.getData()+"  "+i);
		
	}
	
}
