package method_concept;

public class Method_Concept_1 {
	
	public static int getSum(int x, int y) {
		int sum= x+y;
		return sum;
	}
	
	public static void sayHi() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
	System.out.println("Program Start");
	sayHi();
	
	int addition= getSum(10, 20);
	System.out.println("Result :"+ addition);
	}
	
	

}
