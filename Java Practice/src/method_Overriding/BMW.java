package method_Overriding;

public class BMW extends Car {
	
	//Method overriding:
	//When same method is present in parent class as well as in child class with same name and same input parameter or argument.
	public void start() {
		System.out.println("BMW---start");
	}
	
	public void theftSafety() {
		System.out.println("BMW---theftSafety");
	}

}
