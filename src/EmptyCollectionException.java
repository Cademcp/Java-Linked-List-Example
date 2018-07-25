
/**
 * Exceptions class that extends the RuntimeException class in java; formats the output of the exception in a way that allows the user to be more informed 
 * @author Cade McPartlin
 */

public class EmptyCollectionException extends RuntimeException 
{

	public EmptyCollectionException(String collection) {
		
		super("The " + collection + " is empty");
	}
}
