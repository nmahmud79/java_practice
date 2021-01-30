package method_concept;

public class Method_Practice {
	
	static int getSum(int x, int y) {
		int sum=x+y;
		return sum;
	}
	
	static void sayHi() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		System.out.println("Program Starting");
		
		sayHi();
		int output=getSum(10, 20);
		System.out.println("Result :"+output);
	}

}

 