package test4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

// TODO MyList class should implement java.util.List interface.
// The implementation details of the methods can be anything.
// You can use IDE(Eclipse) to identify what methods should be implemented
class MyList<E> implements List<E> {

	@Override
	public int size() {
	return 1;
	}
	
	@Override 
	public boolean isEmpty() {
	return true;
	}
	
	@Override
	public boolean contains(Object o) {
		return true;
	}
	
	@Override
	public boolean add(E e) {
		return true;
	}
	
	@Override
	public boolean remove(Object o) {
		return true;
	}
	
	@Override
	public boolean containsAll(Collection<?> c) {
		return true;
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		return true;
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return true;
	}
	
	@Override
	public boolean removeAll(Collection<?> c) {
		return true;
	}
	
	@Override
	public boolean retainAll(Collection<?> c) {
		return true;
	}
	
	@Override
	public void clear() {
	System.out.println("clear");
	}
	
	@Override
	public boolean equals(Object o) {
		return true;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public int indexOf(Object o) {
		return 1;
	}
	
	@Override
	public int lastIndexOf(Object o) {
		return 1;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public void add(int index, E element) {
		System.out.println("");
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public ListIterator<E> listIterator() {
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}
	
}


