package method_concept;


//Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
//When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.

	public class Method_Parameters {

	public static void myMethod(String fname) {
		
		System.out.println(fname+" "+"Islam");
		
	}
	public static void main(String[] args) {
		myMethod("Nurul");
		myMethod("Mahmud");
		myMethod("Mashud");

	}

}
