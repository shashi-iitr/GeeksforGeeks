package LinkedListOld;

public class DLLReverse {

	private int data;
	private DLLReverse Next;
	private DLLReverse Previous;

	public DLLReverse(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setNext(DLLReverse Next) {
		this.Next = Next;
	}

	public DLLReverse getNext() {
		return this.Next;
	}

	public void setPrevious(DLLReverse Previous) {
		this.Previous = Previous;
	}

	public DLLReverse getPrevious() {
		return this.Previous;
	}

	void reverse(DLLReverse head) {

		DLLReverse cN1 = head;
		DLLReverse cN2 = head;
		DLLReverse cN3 = head;

		if (head == null) {
			System.out.print("Stack underflow");
			return;
		}

		while(cN1.Next!=null){
			cN1=cN1.Next;
		}
		
		while(cN1!=head){
			System.out.print(cN1.getData()+" ");
			cN1=cN1.Previous;
		}
		
		
		/*int i = 0, j = 0;
		
		while (cN1.Next != null) {
			System.out.print(cN1.getData() + " ");
			cN1 = cN1.Next;
			i++;
		}

		System.out.print(cN1.getData() + " ");
		System.out.println();

		while (j < i) {
			DLLReverse temp = new DLLReverse(0);
			temp.setData(cN1.getData());
			cN1.setData(cN2.getData());
			cN2.setData(temp.getData());

			cN2 = cN2.Next;
			cN1 = cN1.Previous;
			i--;
			j++;
		}

		System.out.println();
		while (cN3 != null) {
			System.out.print(cN3.getData() + " ");
			cN3 = cN3.Next;
*/		
	}
}
