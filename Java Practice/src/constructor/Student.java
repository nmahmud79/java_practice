package constructor;

public class Student {
	
	String name;
	
	public Student(String s) {
		name=s;
	}
	
	public Student() {
		name = "Unknown";
	}
	
	void display() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Student s1= new Student("xyz");
		Student s2= new Student();
		s1.display();
		s2.display();
		
	}

}
