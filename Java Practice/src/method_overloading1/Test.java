package method_overloading1;

public class Test {

	public static void main(String[] args) {
		
		int sum=Add.add(10);
		int sum1=Add.add(10, 20);
		int sum2=Add.add(10, 20, 30);
		
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
