package co.vinod.model.d3;

public class DoublyLinkedList<T> {
	public static class Node<T> {
		T data;
		Node<T> prev;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	// unlike SLL head (and tail) are not just references
	// to the actual first node (and last node), but
	// they themselves are nodes (with data=null)
	Node<T> head = new Node<>(null);
	Node<T> tail = new Node<>(null);

	public DoublyLinkedList() {
		head.next = tail;
		tail.prev = head;
	}

	public Node<T> addFirst(T data) {
		return addAfter(head, data);
	}

	public Node<T> addLast(T data) {
		return addBefore(tail, data);
	}

	public Node<T> addAfter(Node<T> node, T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = node.next;
		node.next = newNode;
		newNode.prev = node;
		newNode.next.prev = newNode;
		return newNode;
	}

	public Node<T> addBefore(Node<T> node, T data) {
		return addAfter(node.prev, data);
	}

	public void print() {
		Node<T> curr = head.next;
		System.out.print("|->");
		while (curr.next != null) {
			System.out.print(curr.data);
			System.out.print(" <-> ");
			curr = curr.next;
		}
		System.out.println("<-|");
	}

	public Node<T> getNodeForData(T data) {
		Node<T> curr = head.next;
		while (curr.next != null) {
			if (curr.data.equals(data)) {
				return curr;
			}
			curr = curr.next;
		}
		return null;
	}

	public static void main(String[] args) {
		DoublyLinkedList<String> names;
		names = new DoublyLinkedList<>();

		names.print();
		var vinod = names.addFirst("Vinod");
		names.print();
		var shyam = names.addLast("Shyam");
		names.print();
		var kushal = names.addAfter(vinod, "Kushal");
		names.print();
		names.addBefore(kushal, "Kiran");
		names.print();

		var curr = shyam;
		while (curr.prev != null) {
			System.out.print(curr.data + " -=> ");
			curr = curr.prev;
		}
		System.out.println();

		var kiran = names.getNodeForData("Kiran");
		if (kiran != null) {
			names.addBefore(kiran, "Murali");
			names.print();
		} else {
			System.out.println("Node Kiran not found!");
		}

	}

}
