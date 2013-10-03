package LinkedListOld;

public class LLDelGivenNode {

	private int data;
	private LLDelGivenNode Next;

	public LLDelGivenNode(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setNext(LLDelGivenNode Next) {
		this.Next = Next;
	}

	public LLDelGivenNode getNext() {
		return this.Next;
	}
	
	public void printNode(LLDelGivenNode Node){
		LLDelGivenNode currentNode=Node;
		LLDelGivenNode cN1=Node;
		while(cN1!=null){
			System.out.print(cN1.getData()+" ");
			cN1=cN1.getNext();
		}
	}

	void deleteGivenNode(LLDelGivenNode Node) {

		LLDelGivenNode currentNode = Node;

		if (currentNode.Next == null) {
			System.out.print("Stack underflow");
			return;
		} 
		else {
			
			currentNode.setData(currentNode.Next.getData());
			LLDelGivenNode temp = currentNode.Next;
			currentNode.setNext(temp.Next);

			System.out.print(temp.getData() + "   ");
		}
		currentNode.printNode(currentNode);
	}
}
