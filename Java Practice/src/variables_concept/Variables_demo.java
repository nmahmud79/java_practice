package variables_concept;

	//Java Variables
	//Variables are containers for storing data values.
	//In Java, there are different types of variables, for example:

	//String - stores text, such as "Hello". String values are surrounded by double quotes
	//int - stores integers (whole numbers), without decimals, such as 123 or -123
	//float - stores floating point numbers, with decimals, such as 19.99 or -19.99
	//char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
	//boolean - stores values with two states: true or false

	//A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.

	//To create a variable, you must specify the type and assign it a value:
	//Syntax: type variable = value;
	// int data = 50; here data is variable
public class Variables_demo {
	
	public static void main(String[] args) {
		String name = "Nurul Mahmud";
		System.out.println(name+"\n");
		
		int myNum = 15;
		System.out.println(myNum+"\n");
		
		//Note that if you assign a new value to an existing variable, it will overwrite the previous value:
		int myNum1=20;
		myNum1=25;//now myNum1 is 25
		System.out.println(myNum1+"\n");
		
		//Declare Many Variables
		//To declare more than one variable of the same type, use a comma-separated list:
		int x=5, y=10, z=15;
		System.out.println(x+y+z);
		
		System.out.println("\n");
		//Final Variables
		//However, you can add the final keyword if you don't want others (or yourself) to overwrite existing values (this will 
		//declare the variable as "final" or "constant", which means unchangeable and read-only):
		final int num= 50;
		//num= 60;//// will generate an error: cannot assign a value to a final variable
		
		//Other types of variables 
		
		int number = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		
		
	}

}
