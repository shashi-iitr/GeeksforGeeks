package LinkedListOld;

public class NthNodeFromLast {

	public static void main(String[] args){
		LLNthNodeFromlast head=new LLNthNodeFromlast(12);
		LLNthNodeFromlast n1=new LLNthNodeFromlast(15);
		LLNthNodeFromlast n2=new LLNthNodeFromlast(72);
		LLNthNodeFromlast n3=new LLNthNodeFromlast(36);
		LLNthNodeFromlast n4=new LLNthNodeFromlast(48);
		LLNthNodeFromlast n5=new LLNthNodeFromlast(53);
		LLNthNodeFromlast n6=new LLNthNodeFromlast(60);
		LLNthNodeFromlast n7=new LLNthNodeFromlast(78);
		LLNthNodeFromlast n8=new LLNthNodeFromlast(81);
		LLNthNodeFromlast n9=new LLNthNodeFromlast(93);
		LLNthNodeFromlast n10=new LLNthNodeFromlast(180);
		LLNthNodeFromlast n11=new LLNthNodeFromlast(119);
		
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
		
		head.nthNodeFromLast(head, 5);
	}
		
	
}
