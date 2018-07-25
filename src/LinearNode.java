

public class LinearNode<T> {
	
	private T element;
	private LinearNode<T> next;
	
	public LinearNode() {
		element = null;
		next = null;
	}
	
	public LinearNode(T elem) {
		element = elem;
		next = null;
	}
	
	public void setElement(T element) {
		
		this.element = element;
	}
	
	public T getElement() {
		
		return this.element;
	}
	
	public LinearNode<T> getNext() {
		return next;
		
	}
	
	public void setNext(LinearNode<T> node) {
		this.next = node;
		
	}
	
	
}
