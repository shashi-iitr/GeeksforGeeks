package LinkedList;

public class NthNode {

	public static void main(String[] args){
		SLinkedList n=new SLinkedList();
		LLNode n1=new LLNode(6);
		n.getHead().setHead(n1);
		
		n.insertAtFirst(n.getHead(), 7);
		
	}
}
