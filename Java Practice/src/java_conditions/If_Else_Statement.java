package java_conditions;

		//The Java if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.
		//Use else to specify a block of code to be executed, if the same condition is false
public class If_Else_Statement {

	public static void main(String[] args) {
		
		////defining a variable
		int number = 13;
		//Check if the number is divisible by 2 or not  
		if (number%2==0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		
		System.out.println("\n");
		//Leap Year Example:
		//A year is leap, if it is divisible by 4 and 400. But, not by 100.
		
		int year = 2020;
		
		if (((year%4==0) && (year%100!=0))||(year%400==0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Regular year");
		}
	}

}
