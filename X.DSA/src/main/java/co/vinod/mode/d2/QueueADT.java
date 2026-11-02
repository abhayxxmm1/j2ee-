package co.vinod.mode.d2;

public interface QueueADT<E> {

	void enqueue(E data);
	E dequeue();
	E peek();
	boolean isEmpty();
	boolean isFull();
	int size();
}
