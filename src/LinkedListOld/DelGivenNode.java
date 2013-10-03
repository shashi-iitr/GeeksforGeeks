package LinkedListOld;

public class DelGivenNode {
	
	public static void main(String[] args){
		
		LLDelGivenNode head=new LLDelGivenNode(20);
		LLDelGivenNode n1=new LLDelGivenNode(1);
		LLDelGivenNode n2=new LLDelGivenNode(2);
		LLDelGivenNode n3=new LLDelGivenNode(3);
		LLDelGivenNode n4=new LLDelGivenNode(42);
		LLDelGivenNode n5=new LLDelGivenNode(54);
		LLDelGivenNode n6=new LLDelGivenNode(65);
		LLDelGivenNode n7=new LLDelGivenNode(7);
		LLDelGivenNode n8=new LLDelGivenNode(8);
		
		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(null);
		
		n2.deleteGivenNode(n1);
		
		
	}

}
