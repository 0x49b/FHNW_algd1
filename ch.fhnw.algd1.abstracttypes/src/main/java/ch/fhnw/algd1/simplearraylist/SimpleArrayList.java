package ch.fhnw.algd1.simplearraylist;

import java.util.AbstractList;
import java.util.List;

public class SimpleArrayList<E> extends AbstractList<E> implements List<E> {
	private int minArrLen = 16;
	private Object[] arr = new Object[minArrLen];
	private int size = 0;

	@Override
	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		// TODO (A2) check preconditions
		return (E)arr[index];
	}

	@Override
	public E set(int index, E element) {
		E old = get(index); // includes index checking
		arr[index] = element;
		return old;
	}

	@Override
	public void add(int index, E element) {
		// TODO (A2) implement adding an element in correct position
	}

	@Override
	public E remove(int index) {
		E old = get(index); // includes index checking
		while (index + 1 < size) {
			arr[index] = arr[index + 1];
			index++;
		}
		arr[size] = null;
		size--;
		// TODO (A2) optional: reduce list size, if possible / appropriate
		return old;
	}
}
