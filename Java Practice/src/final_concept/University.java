package final_concept;
		//https://www.javatpoint.com/final-keyword
		//"********final keyword********"
		//The final keyword in java is used to restrict the user. 
		//It is used to make a variable as a constant, Restrict method overriding, Restrict inheritance. It is used at variable level, method level and class level. In java language final keyword can be used in following way.

		//1. Final Keyword at Variable Level---Stop value change
		//2. Final Keyword at Method Level----Stop method override but inherited 
		//3. Final Keyword at Class Level-----Stop inheritance

		//

		//Final at variable level
		//Final keyword is used to make a variable as a constant. This is similar to const in other language. 
		//>>A variable declared with the final keyword cannot be modified by the program after initialization. 
		//>>This is useful to universal constants, such as "PI".
public class University {
	
	final String UNIVERSITY_NAME = "DU";
	//final int fees= 27000;
	
	final int fees;// not initializing here, its called blank or uninitialized final variable.
	//we have to initialize it by creating construtor
	
	//static final int fees;// not initializing here, its called static blank or uninitialized final variable.
	//we have to initialize it in static block
	
	//static{
		//fees= 27000;
	//}
	
	public University() {
		fees= 27000;
	}
	
	public void display() {
		//UNIVERSITY_NAME="JU";//We can't change here because we already use final before variable
		System.out.println("University name: "+UNIVERSITY_NAME);
		System.out.println("Fees :"+fees);
	}

}
