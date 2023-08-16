package LinkedList;

public class _2_LinkedList {

	private _1_ListNode head;
	
	public boolean hasLoop() {
		_1_ListNode slowPtr = head, fastPtr = head;
		while(slowPtr !=null && fastPtr !=null && fastPtr.getNext()!=null) {
			
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr) {
				return true;
			}
		}
		
		return false;
	}
	
	public void create(int data) {
		
		_1_ListNode newNode = createNewNode(data);
		
		if(head==null) {
			head = newNode;
		}
		else {
			_1_ListNode temp = head;
			while(temp.getNext() != null) {
				
				temp= temp.getNext();
				
			}
			temp.setNext(newNode);
		}
		
	}
	private _1_ListNode createNewNode(int data) {
		_1_ListNode newNode = new _1_ListNode();
		newNode.setData(data);
		newNode.setNext(null);
		return newNode;
	}
	
	//Insert a node at the begininning
	public void insertAtTheBegininng(int data) {
		_1_ListNode newNode = createNewNode(data);
		newNode.setNext(head);
		head = newNode;
	}
	
	//Insert a node at the End.
	public void insertAtTheEnd(int data) {
		_1_ListNode newNode = createNewNode(data);
		if(head==null) {
			head = newNode;
		}
		else {
			_1_ListNode p = head;
			while(p.getNext()!=null) {
				p = p.getNext();
			}
			p.setNext(newNode);
		}
	}
	
	
	//Insert a node at the middle.
	public void insertAfter(int position, int data) {
		
		_1_ListNode newNode = createNewNode(data);
		
		if(head==null) {
			head = newNode;
		}
		else if(position==0){
			_1_ListNode temp = newNode;
			temp.setNext(head);
			head=temp;
		}
		else {
			_1_ListNode temp = head;
			for(int i=1; i<position; i++) {
				temp=temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		
	}
	
	//Reverse the linked list
	public void reverse() {
		
		_1_ListNode prevNode = null, nextNode=null;
		
		while(head!=null) {
			nextNode=head.getNext();
			head.setNext(prevNode);
			prevNode=head;
			head=nextNode;
		}
		head=prevNode;
		
	}
	
	//Traverse through the nodes.
	public void traverse() {
		//Taking the current node and pointing to the very first element in the list.
		_1_ListNode currentNode = head;
		while(currentNode !=null) {
			System.out.println(currentNode.getData());//This prints the data in the node
			System.out.println(currentNode.getNext());//This prints the reference of the current node.
			//This will take to the concurrent node.
			currentNode = currentNode.getNext();
		}
	}
	
	public void removeFromBeginning() {
		_1_ListNode temp = head;
		if(temp != null) {
			head  = temp.getNext();
			temp.setNext(null);
		}
	}
	
	public void removeMatching(int data) {
		
		_1_ListNode p = head;
		if(head.getData() == data) {
			p=head;
			head=p.getNext();
			return;
		}
		_1_ListNode q = head;
		while(q.getNext() != null) {
			
			if(q.getNext().getData() == data) {
				p = q.getNext();
				q.setNext(p.getNext());
				return;
				
			}
			q=q.getNext();
			
		}
	}
	
	public void clearList() {
		head = null;
	}
	
	public void findNthNodeFromTheEnding(int n) {
		
		_1_ListNode nthNode = null, temp = head;
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		for(int i=0; i<n; i++) {
			
			if(temp != null) {
				temp = temp.getNext();
			}	
		}
		
		while(temp!=null) {
			
			if(nthNode ==  null) {
				nthNode = head;
			}
			else {
				nthNode = nthNode.getNext();
			}
			temp = temp.getNext();
		}
		
		if(nthNode != null) {
			
			System.out.println(nthNode.getData());
			
		}
		else {
			System.out.println("Not enough element in the list");
		}
		
	}
	
}
