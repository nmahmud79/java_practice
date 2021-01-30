package this_keyword_concept;
		//https://www.javatpoint.com/this-keyword

		//this keyword in java
		//Usage of java this keyword

		//"this" keyword can be use in two ways.
		//this . (this dot)
		//this() (this off)

		//this can be used to refer current class instance variable.
		//this can be used to invoke current class method (implicitly)
		//this() can be used to invoke current class constructor.
		//this can be passed as an argument in the method call.
		//this can be passed as argument in the constructor call.
		//this can be used to return the current class instance from the method.

		//The scope of "this" keyword is within the class. it always point to the current class object.
		//The main purpose of using "this" keyword in real life application is to differentiate variable of class or formal parameters of methods or constructor
		//(it is highly recommended to use the same variable name either in a class or method and constructor while working with similar objects).

		//Note: If any variable is preceded by "this" JVM treated that variable as class variable.

public class Employee {

		String name;
		int age;
		int id;
		
		public Employee(String n, int a, int i) {
			this.name=n;
			this.age=a;
			this.id=i;
		}
		
		public void displayInformation() {
			System.out.println(name+" "+age+" "+id);
		}
		
		//In the above example, parameters (formal arguments) and instance variables are same.
		//>>So, we are using this keyword to distinguish local variable and instance variable.

}
