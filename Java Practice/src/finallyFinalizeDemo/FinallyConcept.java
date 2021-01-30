package finallyFinalizeDemo;

public class FinallyConcept {

	public static void main(String[] args) {
		//test1();
		//test2();
		//division();
		division2();
	}
	
	public static void test1() {
		try {
			System.out.println("inside the test1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside the catch blobk");
		}
		finally {
			System.out.println("inside the final block");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("inside test2 method");
		} finally {
			System.out.println("finally inside the test2 method");
		}
	}
	
	public static void division() {
		int i =10;
		
		try {
			System.out.println("inside try block");
			int k = i/0;
		} catch (ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divided by zero error");
		}
		finally {
			System.out.println("execute this code even after exception");
		}
	}
	
	public static void division2() {
		int i =10;
		
		try {
			System.out.println("inside try block");
			int k = i/0;
		} catch (NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("divided by zero error");
		}
		finally {
			System.out.println("execute this code even after exception");
		}
	}

}
