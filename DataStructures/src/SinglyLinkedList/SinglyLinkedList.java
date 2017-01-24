package SinglyLinkedList;

public class SinglyLinkedList {
	private Node first; 
	private Node last;
	
	public SinglyLinkedList(){
		
	}
	
	public boolean isEmpty(){
		return (first == null);
	}

	// use to insert at beginning of list
	public void insertFirst(int data){
		
		Node newNode = new Node();
		newNode.data = data;
		
		//Assign last
		if(first == null){
			last = newNode;
		}
		
		//new node pushed back the old first
		//and becomes the new first
		newNode.next = first;
		first = newNode;
		
	}
	
	public Node deleteFirst(){
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList(){
		Node current = first;
		
		while(current != null){
			current.displayNode();
			current = current.next;
		}
		System.out.println();
		
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		last.next = newNode;
		last = newNode;
	}
	
}
