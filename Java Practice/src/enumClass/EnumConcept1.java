package enumClass;

public class EnumConcept1 {
	////defining enum within class 
	public enum Season{WINTER, SPRING, SUMMER, FALL}

	public static void main(String[] args) {
	//printing all enum
		for(Season s: Season.values()) {
			System.out.println(s);
	}
		System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
}
}
//Note: Java compiler internally adds values(), valueOf() and ordinal() methods within the enum at compile time.
//It internally creates a static and final class for the enum.
//The enum can be defined within or outside the class because it is similar to a class. 
//The values() method returns an array containing all the values of the enum.
//The valueOf() method returns the value of given constant enum.
//The ordinal() method returns the index of the enum value.