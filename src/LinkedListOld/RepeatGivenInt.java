package LinkedListOld;

public class RepeatGivenInt {

	public static void main(String[] args){
		
		LLRepeatGivenInt head=new LLRepeatGivenInt(5);
		LLRepeatGivenInt n1=new LLRepeatGivenInt(15);
		LLRepeatGivenInt n2=new LLRepeatGivenInt(52);
		LLRepeatGivenInt n3=new LLRepeatGivenInt(5);
		LLRepeatGivenInt n4=new LLRepeatGivenInt(45);
		LLRepeatGivenInt n5=new LLRepeatGivenInt(55);
		LLRepeatGivenInt n6=new LLRepeatGivenInt(5);
		LLRepeatGivenInt n7=new LLRepeatGivenInt(57);
		LLRepeatGivenInt n8=new LLRepeatGivenInt(58);
		LLRepeatGivenInt n9=new LLRepeatGivenInt(5);
		LLRepeatGivenInt n10=new LLRepeatGivenInt(5);
		LLRepeatGivenInt n11=new LLRepeatGivenInt(85);
		LLRepeatGivenInt n12=new LLRepeatGivenInt(5);
		
		
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
		
		head.repGivenInt(head, 5);
		
	}
}
