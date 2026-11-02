package co.vinod.mode.d2;

public class CustomArrayCircularQueue<E> implements QueueADT<E> {

	private static final int CAPACITY = 10;
	private Object[] elements = new Object[CAPACITY];

	private int rear = -1;
	private int front = 0;

	private int count = 0;

	@Override
	public void enqueue(E data) {
		// TODO Auto-generated method stub

		if (isFull()) {
			throw new RuntimeException("Quese is full");

		}
		rear = (rear + 1) % CAPACITY;
		elements[rear] = data;
		count++;

	}

	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		var data = elements[front];
		elements[front] = null;
		front = (front + 1) % CAPACITY;
		count--;
		return (E) data;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty!");
		}
		return (E) elements[front];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return count == CAPACITY;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("|");

		for (int i = 0; i < elements.length; i++) {
			sb.append(elements[i]);
			if (i < elements.length - 1) {
				sb.append(" <- ");
			}
		}
		sb.append("|");

		return sb.toString();
	}
}
