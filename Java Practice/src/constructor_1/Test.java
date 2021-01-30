package constructor_1;

public class Test {
	//Constructor is a special type of method which is used to initialize the object.
	//Properties:
	//1. Constructor has the same name as that of the class it belongs.
	//2. Constructor is a special type of method.
	//3. It has no return type not even void
	//4. It is called automatically
		
	public static void main(String[] args) {
		
		Teacher t1= new Teacher("Mahmud", "Male", 40);
		t1.displayInformation();
		
		Teacher t2= new Teacher("Nurul", "Male", 30);
		t2.displayInformation();
		
		Teacher t3= new Teacher();
		t3.displayInformation();//String default value is null and int is 0.

	}

}
