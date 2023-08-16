package LinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.create(10);
		dll.create(20);
		dll.create(30);
		
		dll.insertAtTheBeginning(100);
		dll.insertAfter(200, 2);
		
		dll.traverse();
		
	}
	
}
