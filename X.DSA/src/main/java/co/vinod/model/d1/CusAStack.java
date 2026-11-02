package co.vinod.model.d1;

public class CusAStack<E> implements StackADT<E>{

	
	private Object[] elements;
	private static final int INITIAL_CAPACITY = 5;
	private int size = 0;
	
	
	public String toString() {

		StringBuilder sb = new StringBuilder(1000);
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i]);
			if (i < size - 1) {
				sb.append(" -> ");
			}
		}
		sb.append("]");

		return sb.toString();
	}

	public CusAStack() {
		// TODO Auto-generated constructor stub
		elements = new Object[INITIAL_CAPACITY];
	}
	
	private void ensureCapacity() {
		if (size >= elements.length) {
			var newElement = new Object[elements.length];
			System.arraycopy(elements, 0, newElement, 0, elements.length);
			elements = newElement;
		}
	}

	@Override
	public void push(E data) {
		// TODO Auto-generated method stub
		
		ensureCapacity();
		elements[size++]= data;
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (size==0) {
			throw new RuntimeException("Empty Stack");
		}
		return (E) elements[--size];
	}


	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (size==0) {
			throw new RuntimeException("Empty Stack");
			
		}
		return (E) elements[size-1];
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		elements = new Object[elements.length];
		
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
