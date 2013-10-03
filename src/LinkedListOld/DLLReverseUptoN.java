package LinkedListOld;

public class DLLReverseUptoN {

	private int data;
	private DLLReverseUptoN Next;
	private DLLReverseUptoN Previous;

	public DLLReverseUptoN(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setNext(DLLReverseUptoN Next) {
		this.Next = Next;
	}

	public DLLReverseUptoN getNext() {
		return this.Next;
	}

	public void setPrevious(DLLReverseUptoN Previous) {
		this.Previous = Previous;
	}

	public DLLReverseUptoN getPrevious() {
		return this.Previous;
	}


	void reverseUptoN (DLLReverseUptoN head, int n){
		
		DLLReverseUptoN cN1=head;
		DLLReverseUptoN cN2= head;
		DLLReverseUptoN cN3= head;
		
		int i=0, j=0;
		while(cN1!=null && i<n){
			cN1=cN1.Next;
			i++;
		}
		
		if(i<n){
			System.out.println("duh!!");
			return;
		}
		
		while(j<i){
			DLLReverseUptoN temp=new DLLReverseUptoN(0);
			temp.setData(cN1.getData());
			cN1.setData(cN2.getData());
			cN2.setData(temp.getData());
			cN1=cN1.Previous;
			cN2=cN2.Next;
			j++; i--;
		}
		
		while(cN3!=null){
			System.out.print(cN3.getData()+" ");
			cN3=cN3.Next;
		}
	}
}
