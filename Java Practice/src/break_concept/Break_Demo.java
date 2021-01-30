package break_concept;

		// Java Break Statement with for loop
		//The Java break statement is used to break loop or switch statement.
		//It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.

		//We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.
public class Break_Demo {

	public static void main(String[] args) {
		//using for loop
		for (int i = 0; i <=4; i++) {
			if (i==4) {
				break;
				//breaking the loop
			}
			System.out.println(i);
		}
	}

}
