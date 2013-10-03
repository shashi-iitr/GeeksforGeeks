package LinkedListOld;

public class NthNode {

	public static void main(String[] args){
		
		LLNthNode head=new LLNthNode(12);
		LLNthNode n1=new LLNthNode(1);
		LLNthNode n2=new LLNthNode(2);
		LLNthNode n3=new LLNthNode(3);
		LLNthNode n4=new LLNthNode(4);
		LLNthNode n5=new LLNthNode(5);
		LLNthNode n6=new LLNthNode(6);
		LLNthNode n7=new LLNthNode(7);
		LLNthNode n8=new LLNthNode(8);
		LLNthNode n9=new LLNthNode(9);
		LLNthNode n10=new LLNthNode(10);
		LLNthNode n11=new LLNthNode(11);
		
		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n9);
		n9.setNext(n10);
		n10.setNext(n11);
		n11.setNext(null);
		
		head.nthNode(head, 6);
	}
}
