package constructor_overloading;

public class Test {

	public static void main(String[] args) {
		
		Teacher t1= new Teacher();
		
		Teacher t2= new Teacher("Nurul", "Male");
		t2.displayInformation();
		
		Teacher t3= new Teacher("Mahmud", "Male", 40);
		t3.displayInformation();

	}

}
