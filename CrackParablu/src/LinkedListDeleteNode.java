//deleting node without traversing list
public class LinkedListDeleteNode {
	// Sabka ladla head
	Node head;

	// Node structure
	class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public Node pushNode(int d) {
		Node n = new Node(d);
		n.next = head;
		head = n;
		return n;
	}
	
//deleting without traversing
	public void deleteNode(Node n) {
		Node temp = n.next;
		n.data=temp.data;
		n.next=temp.next;
		temp=null;
	}
	
//deleting node with key
	public void deleteNode(int key) {
		Node temp=head,prev=null;
		if(temp.data==key){
			head=temp.next;
			return;
		}
		while(temp.data!=key){
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		
	}

//	
	public static void main(String[] args) {
		LinkedListDeleteNode ll = new LinkedListDeleteNode();
		Node n1 = ll.pushNode(1);
		Node n2 = ll.pushNode(2);
		Node n3 = ll.pushNode(3);
		Node n4 = ll.pushNode(4);
		ll.printList();
		ll.deleteNode(1);
		ll.printList();
	}

}
