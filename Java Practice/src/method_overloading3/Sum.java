package method_overloading3;
	
	//Example of Method Overloading with Type Promotion if matching found
	//If there are matching type arguments in the method, type promotion is not performed.
	public class Sum {
		
		public void sum(int a, int b) {
			System.out.println("int arg method invoked");
		}
		
		public void sum(long a, long b) {
			System.out.println("long arg method invoked");
		}
		
		public static void main(String[] args) {
			Sum s = new Sum();
			s.sum(10, 10);//now int arg sum() method gets invoked
		}

}
