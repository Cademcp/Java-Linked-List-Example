/**
 * this class represents a Linked ordered list and extends LinkedList<T>. It contains an add method specific to ordered lists
 * @author Cade McPartlin
 */
public class LinkedOrderedList<T> extends LinkedList<T> implements OrderedListADT<T>
{

	@Override
	public void add(T element)  
	{
		//making sure the element is able to be compared
		Comparable temp = null;
		if (element instanceof Comparable) {
			temp = (Comparable) element;
		} else {
			
		}
		
		LinearNode<T> newNode = new LinearNode<T>(element);
		
		LinearNode<T> current = front;
		LinearNode<T> previous = null;
		
		//if the list is empty, set front and rear = to newNode
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
			//if the element is bigger than the rear, add it to the end
		} else if (temp.compareTo(rear.getElement()) >= 0) {
			rear.setNext(newNode);
			newNode.setNext(null);
			rear = newNode;
			//if the element is smaller than the front, add it to the front
		} else if (temp.compareTo(front.getElement()) <= 0) {
			newNode.setNext(front);
			front = newNode;
		} else {
			//search the list until the element is not bigger than an element in the list
			while ((temp.compareTo(current.getElement()) > 0)) {
				previous = current;
				current = current.getNext();
			}
			newNode.setNext(current);
			previous.setNext(newNode);
		}
		count++;
	}

}
