package LinkedListOld;

public class IntersectTwoSLL {

	public static void main(String[] args){
		
		LLIntersectTwoSLL head1=new LLIntersectTwoSLL(100);
		LLIntersectTwoSLL head2=new LLIntersectTwoSLL(110);
		
		LLIntersectTwoSLL h1n1=new LLIntersectTwoSLL(6);
		LLIntersectTwoSLL h1n2=new LLIntersectTwoSLL(7);
		LLIntersectTwoSLL h1n3=new LLIntersectTwoSLL(8);
		LLIntersectTwoSLL h1n4=new LLIntersectTwoSLL(9);
		LLIntersectTwoSLL h1n5=new LLIntersectTwoSLL(10);
		LLIntersectTwoSLL h1n6=new LLIntersectTwoSLL(11);
		LLIntersectTwoSLL h1n7=new LLIntersectTwoSLL(12);
		
		
		LLIntersectTwoSLL h2n1=new LLIntersectTwoSLL(1);
		LLIntersectTwoSLL h2n2=new LLIntersectTwoSLL(2);
		LLIntersectTwoSLL h2n3=new LLIntersectTwoSLL(3);
		LLIntersectTwoSLL h2n4=new LLIntersectTwoSLL(4);
		LLIntersectTwoSLL h2n5=new LLIntersectTwoSLL(5);
		LLIntersectTwoSLL h2n6=new LLIntersectTwoSLL(6);
		LLIntersectTwoSLL h2n7=new LLIntersectTwoSLL(7);
		LLIntersectTwoSLL h2n8=new LLIntersectTwoSLL(8);
		LLIntersectTwoSLL h2n9=new LLIntersectTwoSLL(9);
		LLIntersectTwoSLL h2n10=new LLIntersectTwoSLL(10);
		LLIntersectTwoSLL h2n11=new LLIntersectTwoSLL(11);
		LLIntersectTwoSLL h2n12=new LLIntersectTwoSLL(12);
		
		LLIntersectTwoSLL n1=new LLIntersectTwoSLL(13);
		LLIntersectTwoSLL n2=new LLIntersectTwoSLL(14);
		LLIntersectTwoSLL n3=new LLIntersectTwoSLL(15);
		LLIntersectTwoSLL n4=new LLIntersectTwoSLL(16);
		LLIntersectTwoSLL n5=new LLIntersectTwoSLL(17);
		
		
		head1.setNext(h1n1);
		h1n1.setNext(h1n2);
		h1n2.setNext(h1n3);
		h1n3.setNext(h1n4);
		h1n4.setNext(h1n5);
		h1n5.setNext(h1n6);
		h1n6.setNext(h1n7);
		h1n7.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(null);
		
		head2.setNext(h2n1);
		h2n1.setNext(h2n2);
		h2n2.setNext(h2n3);
		h2n3.setNext(h2n4);
		h2n4.setNext(h2n5);
		h2n5.setNext(h2n6);
		h2n6.setNext(h2n7);
		h2n7.setNext(h2n8);
		h2n8.setNext(h2n9);
		h2n9.setNext(h2n10);
		h2n10.setNext(h2n11);
		h2n11.setNext(h2n12);
		h2n12.setNext(n1);
		/*n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(null);*/
		
		head1.intersectTwoSLL(head1, head2);
	}
}
