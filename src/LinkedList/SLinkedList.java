package LinkedList;

public class SLinkedList {

	public static void main(String[] args){
		LLHead head=new LLHead();
		LLNode newNode=new LLNode(3);
		head.setHead(newNode);
		
		
		newNode.setNext(new LLNode("hii"));
		newNode=newNode.getNext();
		newNode.setNext(new LLNode("hello"));
		
		new SLinkedList().traverse(head);
		new SLinkedList().insertAtFirst(head, 5);
		new SLinkedList().insertAtLast(head, 4);
		new SLinkedList().traverse(head);
	}
	
	
	
	void traverse(LLHead head){
		
		if(head.getHead()==null){
			return;
		}
		LLNode ptr=head.getHead();
		while(ptr!=null){
			System.out.print(ptr.getData()+" -> ");
			ptr=ptr.getNext();
		}
		System.out.println();
	}
	
	
	void insertAtFirst(LLHead head, int n){
		LLNode newNode=new LLNode(n);
		newNode.setNext(head.getHead());
		head.setHead(newNode);
		
		/*while(newNode!=null){
			System.out.print(newNode.getData());
			newNode=newNode.getNext();
		}*/
	}
	
	void insertAtLast(LLHead head, int n){
		LLNode newNode=new LLNode(n);
		LLNode ptr=head.getHead();
		while(ptr.getNext()!=null){
			ptr=ptr.getNext();
		}
		
		ptr.setNext(newNode);
		
	}
	
	
	
	
}
