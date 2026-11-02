package co.vinod.model.d1;

import java.util.Iterator;

@SuppressWarnings("unused")
public class CusAL<E> implements ListADT<E> {

	private Object[] elements;
	private static final int INITAL_CAPACITY = 5;
	private int size = 0;

	public CusAL() {
		// TODO Auto-generated constructor stub
		elements = new Object[INITAL_CAPACITY];
	}

	@Override
	public void add(E data) {

		ensureCapacity();
		elements[size++] = data;
	}

	private void ensureCapacity() {
		if (size >= elements.length) {
			var newElement = new Object[elements.length * 2];
			System.arraycopy(elements, 0, newElement, 0, elements.length);
			elements = newElement;
		}
	}

	@Override
	public void add(int index, E data) {
		// TODO Auto-generated method stub
		if (index < 0) {
			throw new ListIndexException("Invalid index - negative indexing not allowed");
		}

		if (index > size) {
			throw new ListIndexException("Invalid index for insertion. Possible range is 0-" + size);
		}

		ensureCapacity();

		if (index == size) {
			elements[size++] = data;
			return;
		}

		for (int i = size; i > index; i--) {
			elements[i] = elements[i - 1];
		}
		elements[index] = data;
		size++;

	}

	@SuppressWarnings("unchecked")
	@Override
	public E remove(E data) {

		// Traverse the array to find the given data
		for (int i = 0; i < size; i++) {

			// Check whether the current element matches data
			if (java.util.Objects.equals(elements[i], data)) {

				// Store the element before removing it
				E removedData = (E) elements[i];

				// Shift all elements one position to the left
				for (int j = i; j < size - 1; j++) {
					elements[j] = elements[j + 1];
				}

				// Decrease the size after removing the element
				size--;

				// Set the last unused position to null
				elements[size] = null;

				// Return the removed element
				return removedData;
			}
		}

		// Return null if the element is not found
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E delete(int index) {

		// Check for negative index
		if (index < 0) {
			throw new ListIndexException("Invalid index - negative indexing not allowed");
		}

		// Check whether index is outside the valid range
		if (index >= size) {
			throw new ListIndexException("Invalid index for deletion. Possible range is 0-" + (size - 1));
		}

		// Store the element that needs to be deleted
		E deletedData = (E) elements[index];

		// Shift all elements after index one position to the left
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}

		// Decrease the size after deletion
		size--;

		// Clear the last unused position
		elements[size] = null;

		// Return the deleted element
		return deletedData;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		if (index >= size) {
			throw new ListIndexException("Invalid index - " + index + " for a list of size " + size);
		}

		if (index < 0) {
			throw new ListIndexException("Invalid index - negative indexing not allowed");
		}
		return (E) elements[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public void clear() {

		elements = new Object[elements.length];
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return elements.length;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder(1000);
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i]);
			if (i < size - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");

		return sb.toString();
	}

}
