/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yunwang
 */
public class ArrayListDriver {

	public static void main(String[] args) {
		Student amy = new Student("Amy", 3.5);
		Student bob = new Student("Bob", 3.9);
		Student cindy = new Student("Cindy", 3.6);
		Student david = new Student("David", 3.2);
		Student ethan = new Student("Ethan", 3.1);
		Student frank = new Student("Frank", 3.0);

		System.out.println("~~~~~~~~~~~~ Part I: Test all methods in LinkedOrderedList ~~~~~~~~~~~~~`\n");
		LinkedOrderedList<Student> test1
		= new LinkedOrderedList<>();
		test1.add(amy);
		test1.add(bob);
		test1.add(cindy);
		test1.add(david);
		test1.add(ethan);
		test1.add(frank);
		System.out.println("-----Step 1:  Test add() method, after adding 5 students, LinkedOrderedList  has: " + "\n"
				+ test1.toString());

		test1.remove(cindy);

		System.out.println("\n-----Step 2:  Test remove() method, after test1.remove(cindy), LinkedOrderedList  has: " + "\n"
				+ test1.toString());

		test1.removeFirst();

		System.out.println("\n-----Step 3:  Test removeFirst() method, after test1.removeFirst(), LinkedOrderedList  has: " + "\n"
				+ test1.toString());

		test1.removeLast();

		System.out.println("\n-----Step 4:  Test removeLast() method, after  test1.removeLast(), LinkedOrderedList  has: " + "\n"
				+ test1.toString());

		System.out.println("\n-----Step 5:  Test size() method,  LinkedOrderedList  has: " + "\n"
				+ test1.size() + "  student(s) as \n" + test1.toString());

		System.out.println("\n-----Step 6:  Test isEmpty() method,  is the current LinkedOrderedList Empty?: " + "\n"
				+ test1.isEmpty() + "\n");

		System.out.println("-----Step 7:  Test contains() method,  does the current LinkedOrderedList contain Amy?: " + "\n"
				+ test1.contains(amy) + "\n");

		System.out.println("-----Step 8:  Test contains() method,  does the current LinkedOrderedList contain Cindy?: " + "\n"
				+ test1.contains(cindy) + "\n");

		System.out.println("-----Step 9:  Test first() method, first student in the LinkedOrderedList is \n" + test1.first() + "\n"
				+ "\n");

		System.out.println("-----Step 10:  Test last() method, last student in the LinkedOrderedList is \n" + test1.last() + "\n"
				);


		System.out.println("~~~~~~~~~~~~ Part II: Test all methods in LinkedUnorderedList ~~~~~~~~~~~~~`\n");
		LinkedUnorderedList<Student> test2
		= new LinkedUnorderedList<>();

		test2.addToFront(amy);
		test2.addToFront(bob);
		test2.addToFront(cindy);


		System.out.println("-----Step 1:  Test addToFront() method, \n after .addToFront(amy);\n"
				+ "        .addToFront(bob);\n"
				+ "        .addToFront(cindy),  LinkedUnorderedList  has: " + "\n"
				+ test2.toString());

		test2.addToRear(david);
		test2.addToRear(frank);

		System.out.println("\n-----Step 2:  Test addToRear() method, after .addToRear(david); addToRear(frank), LinkedUnorderedList  has: " + "\n"
				+ test2.toString());

		test2.addAfter(ethan, bob);


		System.out.println("\n-----Step 3:  Test addAfter() method, after"
				+ " .addAfter(ethan, bob);\n"
				+ " LinkedUnorderedList  has: " + "\n"
				+ test2.toString());

		test2.remove(bob);

		System.out.println("\n-----Step 4:  Test remove() method, after .remove(bob), LinkedUnorderedList  has: " + "\n"
				+ test2.toString());

		test2.removeFirst();

		System.out.println("\n-----Step 5:  Test removeFirst() method, after .removeFirst(), LinkedUnorderedList  has: " + "\n"
				+ test2.toString());

		test2.removeLast();

		System.out.println("\n-----Step 6:  Test removeLast() method, after  .removeLast(), LinkedUnorderedList  has: " + "\n"
				+ test2.toString());

		System.out.println("\n-----Step 7:  Test size() method,  LinkedUnorderedList  has: " + "\n"
				+ test2.size() + "  student(s) as \n" + test2.toString());

		System.out.println("\n-----Step 8:  Test isEmpty() method,  is the current LinkedUnorderedList Empty?: " + "\n"
				+ test2.isEmpty() + "\n");

		System.out.println("-----Step 9:  Test contains() method,  does the current LinkedUnorderedList contain Amy?: " + "\n"
				+ test2.contains(amy) + "\n");

		System.out.println("-----Step 10:  Test contains() method,  does the current LinkedUnorderedList contain Cindy?: " + "\n"
				+ test2.contains(cindy) + "\n");

		System.out.println("-----Step 11:  Test first() method, first student in the LinkedUnorderedList is \n " + test2.first() + "\n"
				+ "\n");

		System.out.println("-----Step 12:  Test last() method, last student in the LinkedUnorderedList is \n " + test2.last() + "\n"
				);

	}

}