/**
 * interface for the linked list class
 * @author Cade McPartlin
 */

public interface ListADT<T> {
	public T removeFirst();
	
	public T removeLast();
	
	public T remove(T element);
	
	public T first();
	
	public T last();
	
	public boolean contains(T target);
	
	public boolean isEmpty();
	
	public int size();
	
	public String toString();
	
}
