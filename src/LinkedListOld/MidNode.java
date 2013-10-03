package LinkedListOld;

public class MidNode {

	public static void main(String[] args){
		
		LLMidNode head=new LLMidNode(12);
		LLMidNode n1=new LLMidNode(1);
		LLMidNode n2=new LLMidNode(2);
		LLMidNode n3=new LLMidNode(3);
		LLMidNode n4=new LLMidNode(4);
		LLMidNode n5=new LLMidNode(5);
		LLMidNode n6=new LLMidNode(6);
		LLMidNode n7=new LLMidNode(7);
		LLMidNode n8=new LLMidNode(8);
		LLMidNode n9=new LLMidNode(9);
		LLMidNode n10=new LLMidNode(10);
		LLMidNode n11=new LLMidNode(11);
		LLMidNode n12=new LLMidNode(13);
		
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
		n11.setNext(n12);
		n12.setNext(null);
		
		LLMidNode f=head;
		LLMidNode s=head;
		
		head.midNode(head, f, s);
	}
}
