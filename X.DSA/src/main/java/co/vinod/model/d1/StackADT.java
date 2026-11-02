package co.vinod.model.d1;

public interface StackADT<E> {
	void push(E data);
	E pop();
	E peek();
	boolean isEmpty();
	void clear();
	int size();
}
