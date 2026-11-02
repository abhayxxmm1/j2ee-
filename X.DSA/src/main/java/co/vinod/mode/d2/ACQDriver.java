package co.vinod.mode.d2;

public class ACQDriver {

	public static void main(String[] args) {

		QueueADT<Integer> queue = new CustomArrayCircularQueue<Integer>();
		// 1. Test isEmpty()
		System.out.println("Is Empty: " + queue.isEmpty());

		// 2. Test enqueue()
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		System.out.println("\nAfter Enqueue:");
		System.out.println(queue);

		// 3. Test size()
		System.out.println("Queue Size: " + queue.size());

		// 4. Test peek()
		System.out.println("\nFront Element: " + queue.peek());

		// 5. Test dequeue()
		System.out.println("\nDequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());

		System.out.println("After Dequeue:");
		System.out.println(queue);

		// 6. Test Circular Insertion
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.enqueue(90);
		queue.enqueue(100);
		queue.enqueue(110);
		queue.enqueue(120);

		System.out.println("\nAfter Circular Enqueue:");
		System.out.println(queue);

		System.out.println("Queue Size: " + queue.size());

		// 7. Test isFull()
		System.out.println("\nIs Full: " + queue.isFull());

		// 8. Test dequeue all elements
		System.out.println("\nRemoving All Elements:");

		while (!queue.isEmpty()) {
			System.out.println("Removed: " + queue.dequeue());
		}

		// 9. Test isEmpty() again
		System.out.println("\nIs Empty: " + queue.isEmpty());

		// 10. Test exception handling
		try {
			queue.dequeue();
		} catch (RuntimeException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
