package LinkedListOld;

public class ReverseUptoN {

	public static void main(String [] args){
		
		DLLReverseUptoN head=new DLLReverseUptoN(0);
		DLLReverseUptoN n1=new DLLReverseUptoN(1);
		DLLReverseUptoN n2=new DLLReverseUptoN(2);
		DLLReverseUptoN n3=new DLLReverseUptoN(3);
		DLLReverseUptoN n4=new DLLReverseUptoN(4);
		DLLReverseUptoN n5=new DLLReverseUptoN(5);
		DLLReverseUptoN n6=new DLLReverseUptoN(6);
		DLLReverseUptoN n7=new DLLReverseUptoN(7);
		
		head.setPrevious(null);
		head.setNext(n1);
		n1.setPrevious(head);
		n1.setNext(n2);
		n2.setPrevious(n1);
		n2.setNext(n3);
		n3.setPrevious(n2);
		n3.setNext(n4);
		n4.setPrevious(n3);
		n4.setNext(n5);
		n5.setPrevious(n4);
		n5.setNext(n6);
		n6.setPrevious(n5);
		n6.setNext(n7);
		n7.setPrevious(n6);
		n7.setNext(null);
		
		head.reverseUptoN(head, 2);
		
	}
}
