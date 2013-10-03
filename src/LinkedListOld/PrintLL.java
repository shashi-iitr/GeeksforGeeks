package LinkedListOld;

public class PrintLL {

	public static void main(String[] args){
		LLNode list=new LLNode(0);
		for(int i=0; i<6; i++){
			list.setNext(new LLNode(i));
		}
	}
}
