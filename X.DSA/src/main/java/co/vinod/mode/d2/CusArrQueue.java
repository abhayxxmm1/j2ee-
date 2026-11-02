package co.vinod.mode.d2;

public class CusArrQueue<E> implements QueueADT<E>{

	private Object[] elements;
	private int size = 0;
	
	public CusArrQueue() {
		// TODO Auto-generated constructor stub
		elements = new Object[10];
	}

	@Override
	public void enqueue(E data) {
		// TODO Auto-generated method stub
		if (isFull()) {
			throw new RuntimeException("Empty Queue");
		}
		
		elements[size++] = data;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() {

		// TODO Auto-generated method stub
		
		if (isFull()) {
			throw new RuntimeException("Empty Queue");
			
		}
		
		var data = elements[0];
		for (int i = 0; i < size-1; i++) {
			elements[i] = elements[i+1];
		}
		
		size--;
		return (E) data;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new RuntimeException("Empty Queue");
		}
		return (E) elements[0];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size==elements.length;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for (int i = 0; i < size; i++) {
			sb.append(elements[i]);
			if (i<size-1) {
				sb.append(" << ");
			}
		}
		sb.append("]");
		
		
		return sb.toString();
				
	}
	
	
	
}
