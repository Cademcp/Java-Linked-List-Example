/**
 * this class represents an unordered list and extends LinkedList<T>. This class also has 3 methods unique to unordered lists.
 * @author Cade McPartlin
 */
public class LinkedUnorderedList<T> extends LinkedList<T> implements UnOrderedListADT<T>
{

	//adding a specific element to the front of the list
	@Override
	public void addToFront(T element)
	{
		LinearNode<T> newNode = new LinearNode<T>(element);

		//if empty, front and rear = newNode
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			//setting newNode's next to the current front and updating front to newNode
			newNode.setNext(front);
			front = newNode;
		}
		count++;
	}

	//adding a specific element to the rear of a list
	@Override
	public void addToRear(T element)
	{
		LinearNode<T> newNode = new LinearNode<T>(element);

		//if empty, front and rear = newNode
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			//setting rear's next element to newNode
			rear.setNext(newNode);
			//updating newNode's next to null
			newNode.setNext(null);
			//updating rear to null
			rear = newNode;
		}
		count++;
	}

	//adds a specific element to the list after a specified target element
	@Override
	public void addAfter(T element, T target)
	{
		Comparable temp = null;
		
		if (target instanceof Comparable) {
			temp = (Comparable) target;
		}

		LinearNode<T> current = front;
		LinearNode<T> previous = null;
		
		LinearNode<T> newNode = new LinearNode<T>(element);
		
		//if empty, front and rear = newNode
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			//looping through list to find the target 
			while (!current.getElement().equals(target)) {
				previous = current;
				current = current.getNext();
			}
			//setting newNode after the current element
			newNode.setNext(current.getNext());
			current.setNext(newNode);
		}
		count++;
	}

}
