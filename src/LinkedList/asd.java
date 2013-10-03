package LinkedList;

public class asd {

	public static void main(String[] args){
		SLinkedList l=new SLinkedList();
		LLNode newNode=new LLNode(3);
		l.getHead().setHead(newNode);
		
		l.insertAtFirst(l.getHead(), 8);
		l.insertAtLast(l.getHead(), 89);
		l.traverse(l.getHead());
	}

}
