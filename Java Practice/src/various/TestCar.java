package various;

public class TestCar {

	public static void main(String[] args) {
		BMWJava b = new BMWJava();
		b.start();
		b.stop();
		b.engin();
		b.theftSafety();
	}

}


//					*****Method Overriding*****
//When same method is present in parent class as well as in child class with same name and parameter or argument.
//or declare a method in sub-class which is already present in superclass is called method overriding.
//Why: Code reuse; one interface, multiple implement and for run time polymorphism
//child class can give its own specific implementation to a method which is already provided by the parent class.
//Rules: 
//Name, signature type, parameter must be the same, IS-A relationship (interface)
//If a method can’t be inherited, then it can’t be overridden.
//A method declared as “final” or “static” can’t be overridden (static method is bound to class and method is bound to object).
//Java main method also can’t be override because it is also a static method.
//Constructor can’t be overridden because constructor is not inherited.
//We can override the overloaded method.
//we cannot override the private methods because the scope of private methods is limited to the class 
//and we cannot access them outside of the class.






