package LinkedListOld;

public class DelMAfterN {

	public static void main(String[] args) {

		LLDelMAfterN head = new LLDelMAfterN(20);
		LLDelMAfterN n1 = new LLDelMAfterN(1);
		LLDelMAfterN n2 = new LLDelMAfterN(2);
		LLDelMAfterN n3 = new LLDelMAfterN(3);
		LLDelMAfterN n4 = new LLDelMAfterN(42);
		LLDelMAfterN n5 = new LLDelMAfterN(54);
		LLDelMAfterN n6 = new LLDelMAfterN(65);
		LLDelMAfterN n7 = new LLDelMAfterN(7);
		LLDelMAfterN n8 = new LLDelMAfterN(8);

		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(null);

		head.delMAfterN(head, 2, 3);
	}

}
