package this_keyword_concept;
		
		//Calling parameterized constructor from default constructor:
	public class Student1 {
		
		public Student1() {
			this(5);//Rule: Call to this() must be the first statement in constructor.
			System.out.println("hello a");
		}
		
		public Student1(int x) {
			System.out.println(x);
		}
	}
