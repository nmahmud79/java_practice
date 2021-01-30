package arrayDemo;
//To declare an array, define the variable type with square brackets:
//String[] cars;
//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};//insert value
//int[] myNum = {10, 20, 30, 40};
public class arrayConcept2 {

	public static void main(String[] args) {
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[0] = "Opel";
		
		System.out.println(cars[0]);
		System.out.println(cars.length);
		
		//for (int i = 0; i < cars.length; i++) {
		//System.out.println(cars[i]);
		//	}
	}

}
