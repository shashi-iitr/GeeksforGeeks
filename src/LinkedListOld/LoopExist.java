package LinkedListOld;

public class LoopExist {

	public static void main(String[] args){
	
		LLLoopExist head=new LLLoopExist(12);
		LLLoopExist n1=new LLLoopExist(1);
		LLLoopExist n2=new LLLoopExist(2);
		LLLoopExist n3=new LLLoopExist(3);
		LLLoopExist n4=new LLLoopExist(4);
		LLLoopExist n5=new LLLoopExist(5);
		LLLoopExist n6=new LLLoopExist(6);
		LLLoopExist n7=new LLLoopExist(7);
		LLLoopExist n8=new LLLoopExist(8);
		LLLoopExist n9=new LLLoopExist(9);
		LLLoopExist n10=new LLLoopExist(10);
		LLLoopExist n11=new LLLoopExist(11);
		
		LLLoopExist node=new LLLoopExist(15);
		node.setNext(null);
		
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
		n11.setNext(n1);
		
		head.loopExist(head, node);
	}
}
