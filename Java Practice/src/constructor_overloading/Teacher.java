package constructor_overloading;

	public class Teacher {
		
		String name, gender;
		int age;
		
		public Teacher() {
			System.out.println("Default Constructor");
		}
		
		public Teacher (String n, String g) {
			name=n;
			gender=g;
		}
		
		public Teacher (String n, String g, int a) {
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
