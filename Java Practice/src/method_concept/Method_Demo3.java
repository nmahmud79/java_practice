 package method_concept;

public class Method_Demo3 {

	static int getSum(int x, int y){
		int sum= x+y;
		return sum;
	}
	
	static void sayHi() {
		System.out.println("HI");
	}

	public static void main(String[] args) {
		System.out.println("Program Starting");
		
	 sayHi();
	 int output= getSum(10, 15);
	 System.out.println("Result:"+output);

}

}