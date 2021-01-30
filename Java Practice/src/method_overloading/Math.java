package method_overloading;

//****Method Overloading***********
//Same method name with different parameters within the same Class.
//There are two ways to overload the method in java:
//1.By changing number of arguments or parameters
//2.By changing the data type
//We can't create a method inside a method and can't create duplicate method
//sum method is overload under
//We can overload main method.
//It is similar to constructor overloading in Java.
//Note: In Java, Method overloading is not possible by changing the return type of the method only.

public class Math {
	
	public void sum() {
		System.out.println("SUM Method----Zero parameter");
	}
	
	public void sum(int i) {
		System.out.println("\nSUM Method---One Parameter");
		System.out.println(i);
	}
	
	public void sum(int i, int j) {
		System.out.println("\nSUM Method---Two Parameter");
		System.out.println(i+j);
	}
	

}
