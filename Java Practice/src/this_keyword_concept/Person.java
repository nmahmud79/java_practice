package this_keyword_concept;

		//this() : to invoke current class constructor
		//The this() constructor call can be used to invoke the current class constructor. 
		//It is used to reuse the constructor. In other words, it is used for constructor chaining.

		//Calling default constructor from parameterized constructor:

	public class Person {
		
		public Person() {
			System.out.println("Hello Person");
		}
		
		public Person(int x) {
			this();
			System.out.println(x);
		}

	}
