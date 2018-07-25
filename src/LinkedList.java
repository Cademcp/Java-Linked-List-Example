/**
 * The linked list has methods used to gather information about a linked list. It also provides some methods to manipulate a list 
 * @author Cade McPartlin
 */
public class LinkedList<T> implements ListADT<T>
{

	protected int count;
	protected LinearNode<T> front;
	protected LinearNode<T> rear;

	public LinkedList() {
		count = 0;
		front = null;
		rear = null;
	}

	//removes first element of the list
	@Override
	public T removeFirst() throws EmptyCollectionException
	{
		if (isEmpty()) {
			throw new EmptyCollectionException("List");
		}

		//creating a new linearnode and setting it equal to front
		LinearNode<T> result = front;
		//sets front equal to the element after it, erasing the current front 
		front = front.getNext();
		if (front == null) {
			rear = null;
		}
		count--;

		return result.getElement();
	}

	//removes last element of the list
	@Override
	public T removeLast() throws EmptyCollectionException
	{
		if (isEmpty()) {
			throw new EmptyCollectionException("List");
		}

		LinearNode<T> previous = null;
		LinearNode<T> current = front;

		//cycling through the list until it gets to the last node
		while (current.getNext() != null) {
			previous = current;
			//sets the current node, which is the last node, equal to null, removing the last node from the list
			current = current.getNext();
		}

		LinearNode<T> result = rear;
		rear = previous;
		if (rear == null) {
			front = null;
		} else {
			//sets rear = to the next element, which is null
			rear.setNext(null);
		}
		count--;

		return result.getElement();
	}

	//removes a specific element from the list 
	@Override
	public T remove(T element) throws EmptyCollectionException, ElementNotFoundException
	{
		if (isEmpty()) {
			throw new EmptyCollectionException("List");
		}

		boolean found = false;
		LinearNode<T> previous = null;
		LinearNode<T> current = front;

		//cycling through the list as long as current is not null and current is not the element that needs to be removed
		while (current != null && !found) {
			//if current = the element we want to remove, found = true
			if (element.equals(current.getElement())) {
				found = true;
			} else {
				previous = current;
				current = current.getNext();
			}
		}

		if (!found) {
			throw new ElementNotFoundException("List");
		}

		//setting front and rear to null since there will be nothing in the list
		if (size() == 1) {
			front = null;
			rear = null;
			//resetting front to the element that comes after it
		} else if (current.equals(front)) {
			front = current.getNext();
			//setting rear equal to the element that comes before it & resets the element after it to null
		} else if (current.equals(rear)) {
			rear = previous;
			rear.setNext(null);
		} else {
			previous.setNext(current.getNext());
		}

		count--;

		return current.getElement();
	}

	//returns the first element of the list
	@Override
	public T first()
	{
		return front.getElement();
	}

	//returns the last element of the list
	@Override
	public T last()
	{
		return rear.getElement();
	}

	//determines if the specified element is in the list
	@Override
	public boolean contains(T target)
	{
		if (isEmpty()) {
			return false;
		}

		LinearNode<T> current = front;

		//if the front = the target return true
		if (current.equals(target)) {
			return true;
		} else {
			//looping through as long as current is not null
			while (current.getNext() != null) {
				//progressing the loop
				current = current.getNext();
				//return true if current = the target we are looking for
				if (current.getElement().equals(target)) {
					return true;
				}
			}
		}
		return false;
	}

	//returns if the list is empty or not
	@Override
	public boolean isEmpty()
	{
		if (front == null & rear == null) {
			return true;
		}
		else return false;
	}

	//returns the size of the list
	@Override
	public int size()
	{
		return count;
	}

	//formatting the output
	public String toString() {

		if (isEmpty()) {
			return "";
		}

		LinearNode<T> node = front;
		String result = "";
		//loops over all LinearNode elements and returns them in order 
		while (node != null) {

			result = result + node.getElement().toString();
			node = node.getNext();
		}

		return result;
	}
}
