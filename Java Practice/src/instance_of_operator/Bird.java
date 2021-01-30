package instance_of_operator;

		//instanceof in java with a variable that have null value
		//If we apply instanceof operator with a variable that have null value, it returns false.
public class Bird {
	
	public static void main(String[] args) {
		
		Bird b = null;
		System.out.println(b instanceof Bird);
	}

}
