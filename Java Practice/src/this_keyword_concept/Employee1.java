package this_keyword_concept;
		//If local variables(formal arguments) and instance variables are different, there is no need to use this keyword like in the following program:
	public class Employee1 {
			
		String name;
		int age;
		int id;
		
		public Employee1(String n, int a, int i) {
			name=n;
			age=a;
			id=i;
		}
		
		public void displayInformation() {
			System.out.println(name+" "+age+" "+id);
		}
	}
