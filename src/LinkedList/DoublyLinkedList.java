package LinkedList;

public class DoublyLinkedList {

	private DLLNode head;
	
	public void create(int data) {
		
		DLLNode temp, q;
		temp = createNewNode(data);
		if(head==null) {
			head=temp;
		}
		else {
			temp = head;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			q = createNewNode(data);
			temp.setNext(q);
			q.setPrev(temp);
		}
	}

	private DLLNode createNewNode(int data) {
		DLLNode node = new DLLNode();
		node.setData(data);
		return node;
		//Previous and next , by default will point to null.
	}
	
	public void insertAtTheBeginning(int data) {
		
		DLLNode newNode = createNewNode(data);
		head.setPrev(newNode);
		newNode.setNext(head);
		head = newNode;
		
	}
	
	public void insertAfter(int data, int position) {
		
		if(head==null) {
			head=createNewNode(data);
		}
		else if(position==0) {
			DLLNode temp = createNewNode(data);
			head.setPrev(temp);
			head.setNext(head);
			head=temp;
		}
		else {
			DLLNode temp = head;
			for(int i=1; i<position; i++) {
				temp = temp.getNext();
				
			}
			
			DLLNode newNode = createNewNode(data);
			newNode.setNext(temp.getNext());
			newNode.setPrev(temp);
			newNode.getNext().setPrev(newNode);
			temp.setNext(newNode);
		}
		
	}
	
	public void traverse() {
		DLLNode temp=head;
		while(temp!=null) {
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	
}
