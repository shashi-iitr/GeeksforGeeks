package LinkedListOld;

public class LLRepeatGivenInt {

	private int data;
	private LLRepeatGivenInt Next;
	
	public LLRepeatGivenInt(int data){
		this.data=data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setNext(LLRepeatGivenInt Next){
		this.Next=Next;
	}
	
	public LLRepeatGivenInt getNext(){
		return this.Next;
	}
	
	
	void repGivenInt(LLRepeatGivenInt head, int k){
		if(head==null){
			System.out.print("Stack underflow");
			return;
		}
		
		LLRepeatGivenInt currentNode=head;
		int count=0;
		while(currentNode!=null){
			if(currentNode.getData()==k){
				count++;
			}
			System.out.print(currentNode.getData()+" ");
			currentNode=currentNode.getNext();
		}
		System.out.print("\n"+count);
	}
}
