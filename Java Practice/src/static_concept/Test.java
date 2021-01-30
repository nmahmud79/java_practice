package static_concept;

public class Test {

	public static void main(String[] args) {
		Student s = new Student("Nurul", 40);
		Student s1= new Student("Mahmud", 30);
		
		//we can change the college of all objects by the single line of code  
		//Student.college="BBDIT";  
		
		s.display();
		s1.display();

	}

}
