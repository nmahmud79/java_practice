package instance_of_operator;
		//
public class Goat extends Cow {

		static void method(Cow c) {
			if (c instanceof Goat) {
			Goat g = (Goat)c;//downcasting
			System.out.println("ok downcasting is performed");
			}
		}
	public static void main(String[] args) {
		//Goat g = new Cow();// compile time error
		//Goat g = (Goat)new Cow();
		//Compiles successfully but ClassCastException is thrown at runtime 
		
		Cow c = new Goat();
		Goat.method(c);
	}
}
