package LinkedListOld;

public class LLNthNodeFromlast {

	private int data;
	private LLNthNodeFromlast Next;
	
	public LLNthNodeFromlast(int data){
		this.data=data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public void setNext(LLNthNodeFromlast Next){
		this.Next=Next;
	}
	
	public int getData(){
		return data;
	}
	
	public LLNthNodeFromlast getNext(){
		return this.Next;
	}
	
	
	void nthNodeFromLast(LLNthNodeFromlast head, int n){
		if(head==null){
			System.out.print("stack underflow");
			return;
		} 
		
		LLNthNodeFromlast cN1=head;
		LLNthNodeFromlast cN2=head;
		int i=0;
		while(i<n && cN1!=null){
			cN1=cN1.Next;
			i++;
		}
		if(i<n){
			System.out.print("stack underflow");
			return;
		}
		while(cN1.Next!=null){
			cN2=cN2.Next;
			cN1=cN1.Next;
		}
		
		System.out.print(cN2.getData()+" "+cN1.getData());
	}
	
}
