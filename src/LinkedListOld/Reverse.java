package LinkedListOld;

public class Reverse {

	public static void main(String [] args){
		
		DLLReverse head=new DLLReverse(0);
		DLLReverse n1=new DLLReverse(1);
		DLLReverse n2=new DLLReverse(2);
		DLLReverse n3=new DLLReverse(3);
		DLLReverse n4=new DLLReverse(4);
		DLLReverse n5=new DLLReverse(5);
		DLLReverse n6=new DLLReverse(6);
		DLLReverse n7=new DLLReverse(7);
		
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
		
		head.reverse(head);
		
	}
}
