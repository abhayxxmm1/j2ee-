package co.vinod.model.d1;

public interface ListADT<E> {
	
	void add(E data);
	void add(int index, E data);
	
	E get(int index);
	E remove(E data);
	E delete(int index);
	
	int size();
	boolean isEmpty();
	void clear();
	int capacity();
}
