/**
 * This class is an exception that is thrown when the element that is being searched for in the find() method is not in the array list
 * @author Cade McPartlin
 */

public class ElementNotFoundException extends RuntimeException 
{

public ElementNotFoundException (String collection) {
		
		super("The " + collection + " is empty");
	}
	
}
