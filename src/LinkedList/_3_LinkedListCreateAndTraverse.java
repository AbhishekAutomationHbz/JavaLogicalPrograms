package LinkedList;

public class _3_LinkedListCreateAndTraverse {

	public static void main(String[] args) {
		_2_LinkedList linkedList = new _2_LinkedList();
		linkedList.create(1);
		linkedList.create(2);
		linkedList.create(3);
		
		
		
		/*
		 * linkedList.insertAtTheBegininng(10); linkedList.insertAtTheEnd(30);
		 * linkedList.insertAfter(3, 40);
		 */
		 
		//linkedList.reverse();
		linkedList.findNthNodeFromTheEnding(2);
		linkedList.traverse();
		
		
		
	}
	
}
