package LinkedListOld;

public class LLLoopExist {

	private int data;
	private LLLoopExist Next;
	
	public LLLoopExist(int data){
		this.data=data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public void setNext(LLLoopExist Next){
		this.Next=Next;
	}
	
	public int getData(){
		return data;
	}
	
	public LLLoopExist getNext(){
		return this.Next;
	}
	
	
	void loopExist(LLLoopExist head, LLLoopExist node){
		
		LLLoopExist currentNode=head;
		currentNode=currentNode.Next.Next;
		int i=2;
		while(currentNode.Next!=head.Next){
			i++;
			System.out.print(currentNode.getData()+" ");
			currentNode=currentNode.Next;
			
			if(head.Next==currentNode.Next){
				System.out.print("\n Loop exist @ "+ i);
			}
			
		}
		System.out.print("\n "+currentNode.getData());
		
		
		//insert after i
		node.setNext(currentNode);
		currentNode=node;
		System.out.print("\n "+currentNode.getData());
	}
}
