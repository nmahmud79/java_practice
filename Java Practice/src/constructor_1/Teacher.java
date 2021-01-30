package constructor_1;

	public class Teacher {
		
		String name, gender;
		int age;
		
		public Teacher() {
			System.out.println("No value");
		}
		
		public Teacher(String n, String g, int a) {
			name=n;
			gender=g;
			age=a;
		}
		
		public void displayInformation() {
			System.out.println("Name :"+name);
			System.out.println("Gender :"+gender);
			System.out.println("Age :"+age);
			System.out.println("\n\n");
		
		}
}
