package constructor;

public class Student1 {
	
	int id;
	String name;
	
	public Student1(int i, String n) {
		id=i;
		name=n;
	}
	public void displayInfo() {
		System.out.println("id :"+id);
		System.out.println("name :"+name);
	}

}
