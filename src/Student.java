/**
 * This class is used in the tester to provide an object to add/remove from the array list
 * @author Cade McPartlin
 */

public class Student implements Comparable<Student> {
		private String name;
		private double gpa;
		
		public Student(String name, double gpa) {
			this.name = name;
			this.gpa = gpa;
		}
		
		public String getName() {
			return name;
		}
		
		public double getGPA() {
			return gpa;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setGPA(double gpa) {
			this.gpa = gpa;
		}

		public int compareTo(Student other) {
			
			if (this.gpa == other.getGPA()) {
				return 0;
			} else if (this.gpa > other.getGPA()) {
				return 1;
			} else {
				return -1;
			}
		}
		
		public String toString() {
			
			return "Student{name=" + this.getName() + ", gpa=" + this.getGPA() + "}\n";
		}
}
