package co.vinod.mode.d2;

public class SinglyLinkedList<E> {

	private static class Node<E> {
		E data;
		Node<E> next;

		Node(E data) {

			this.data = data;
		}
	}

	private Node head = null;
	private int count = 0;

	public int findIndex(E data) {
		if (isEmpty()) {
			throw new RuntimeException("List is empty!");
		}
		
		Node curr=head;
		int index =0;
		while (curr!=null) {
			if (curr.data.equals(data)) {
				return index;
			}
			index++;
			curr = curr.next;
		}

		return -1; // -1 because there is no indexing in -ve
	}

	
	
	/// TODO insertAtIndex, insertFirst, insertLast
	
	
	
	
	
	public void print() {
		if (head == null) {
			System.out.println("The List Empty!");
			return;
		}

		Node curr = head;

		for (int i = 0; i < count; i++) {
			System.out.print("[" + i + "]");
			System.out.print(curr.data);

			if (i < count - 1) {
				System.out.print(" -> ");
				
			}
			curr = curr.next;
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return head == null;
	}
}
