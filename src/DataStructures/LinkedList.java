package DataStructures;

public class LinkedList {
	
	Node head;
	
	public void insert(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head =newNode;
		}
		else {
			
			Node lastIndex = head;
			
			while(lastIndex.next != null) {
				
				lastIndex = lastIndex.next;
			}
			lastIndex.next = newNode;
		}
	}
	
	public void delete(int data) {
		
		Node currentNode = head;
		Node previousNode = currentNode;
		
		if(head.data == data) {
			head = head.next;
		}
		else {
			
			while(currentNode.next != null) {
				
				previousNode = currentNode;
				
				if(currentNode.data == data) {
					previousNode.next = currentNode.next;
				}
			}
		}
		
	}
	
	public void display() {
		
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.println(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(9);
		list.insert(15);
		
		list.display();
	}
	
}
