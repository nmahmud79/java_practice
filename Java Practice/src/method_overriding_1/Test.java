package method_overriding_1;

public class Test {

	public static void main(String[] args) {

		Walk w = new Walk();
		w.walk();
		//Problem is that I have to provide a specific implementation of walk() method in subclass that is why we use method overriding.
	}

}
