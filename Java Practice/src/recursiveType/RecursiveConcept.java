package recursiveType;
//						***Recursive Method******
//A method that call itself is known as recursive method and this technique is known as recursion
//A physical world example would be to place two parallel mirrors facing each other>>
//Any object in between them would be reflected recursively.
//Syntax: returntype methodname(){
//code to be executed
//methodname();//calling same method
//The recursion continues until some condition is met to prevent it from execution>> 
//If not, infinite recursion occurs.
//Hence, to prevent infinite recursion, if...else statement (or similar approach)>> 
//can be used where one branch makes the recursive call and other doesn't.
//Advantage & disadvantage:
//When a recursive call is made, new storage location for variables are allocated on the stack.
//As, each recursive call returns, the old variables and parameters are removed from the stack. 
//Hence, recursion generally use more memory and are generally slow.
//On the other hand, recursive solution is much simpler and takes less time to write, debug and maintain.

public class RecursiveConcept {
	
	static int count=0;
	
	static void p() {
		count++;
		if (count<=5) {
		System.out.println("hello"+count);
		p();
		}
	}
	public static void main(String[] args) {
		p();
	}
}
