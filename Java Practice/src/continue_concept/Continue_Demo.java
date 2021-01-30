package continue_concept;

		//Java Continue Statement
		//The continue statement is used in loop control structure when you need to jump to the next iteration of the loop immediately. 
		//It can be used with for loop or while loop.
		//The Java continue statement is used to continue the loop. 
		//It continues the current flow of the program and skips the remaining code at the specified condition. 
		//In case of an inner loop, it continues the inner loop only.

		//We can use Java continue statement in all types of loops such as for loop, while loop and do-while loop.
public class Continue_Demo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;//it skips the value of 4.
			  }
			  System.out.println(i);
			}
	}

}
