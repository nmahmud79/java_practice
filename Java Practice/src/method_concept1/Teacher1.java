package method_concept1;

	public class Teacher1 {
		
		String name, gender;
		int age;
				
		public void setInformation(String n, String m, int a) {
			name=n;
			gender=m;
			age=a;
		}
		
		public void displayInformation() {
			System.out.println("Name :"+name);
			System.out.println("Gender :"+gender);
			System.out.println("Age :"+age);
			System.out.println("\n\n");
		}

}
