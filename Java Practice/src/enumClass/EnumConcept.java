package enumClass;

//The Enum in Java is a data type which contains a fixed set of constants. You can create your own data type
//Or
//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
//It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY)
//directions (NORTH, SOUTH, EAST, and WEST), season (SPRING, SUMMER, WINTER, and AUTUMN or FALL)
//colors (RED, YELLOW, BLUE, GREEN, WHITE, and BLACK) etc. According to the Java naming conventions
//we should have all constants in capital letters. So, we have enum constants in capital letters.
//Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change). 
//The Java enum constants are static and final implicitly. It is available since JDK 1.5.
//Enum can be traversed
//Enum can have fields, constructors and methods
//Enum may implement many interfaces but cannot extend any class because it internally extends Enum class

public class EnumConcept {
	//define the enum class outside the main class
	public enum Month {JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER}
	//main method
	public static void main(String[] args) {
	//traversing the enum
		for (Month m:Month.values())
			System.out.println(m);
	}
}
