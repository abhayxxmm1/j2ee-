package co.vinod.model.d3;

public class CircularLinkedList<T> {

	public static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head = null;
	private int size = 0;

	public Node<T> getHead() {
		return head;
	}

	public void add(T data) {
		Node<T> newNode = new Node<>(data);

		if (head == null) {
			head = newNode;
		} else {
			Node<T> curr = head;
			while (curr.next != head) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
		newNode.next = head;
		size++;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void print() {
		if (head == null) {
			System.out.println("The list empty!");
			return;
		}

		Node<T> curr = head;

		for (int i = 0; i < size; i++) {
			System.out.print("[" + i + "] ");
			System.out.print(curr.data);

			if (i < size - 1) {
				System.out.print(" -> ");
			}
			curr = curr.next;
		}
		System.out.println();

	}

	public int size() {
		return size;
	}

	public static void main1(String[] args) {
		CircularLinkedList<Integer> nums = new CircularLinkedList<>();
		nums.add(100);
		nums.add(2000);
		nums.add(123);
		nums.add(4949);
		nums.print();
	}

	// TODO: Check this function; Looks like not working properly.
	public void remove(T t) {
		// if the list is empty
		if (head == null) {
			return;
		}

		// if the list contains only one node
		if (head == head.next) {
			head = null;
			return;
		}

		Node<T> curr = head;
		while (curr.next != head) {
			if (curr.next.data.equals(t)) {
				var nodeToDelete = curr.next;
				curr.next = nodeToDelete.next;
				nodeToDelete.next = null;
				nodeToDelete = null;
				return;
			}
			curr = curr.next;
		}

	}

}
