package stringConcept;

public class StringDemo {
	
	//Generally, String is a sequence of characters. 
	//But in Java, String basically an object that represent sequence of char value.
	//An Array characters works same as Java String
	//char[] ch = {"N","U","R","U","L",};
	//String s = new String[ch];
	//OR String s = "Java Point";
	//The java.lang.String class is used to create a string object.
	//Java String class provides a lot of methods to perform operations on string such as
	//compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
	//The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
	//The Java String is immutable which means it cannot be changed. Whenever we change any string, 
	//a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder classes.
	//How to create a string object---1) By Literal & 2) By new key word
	//String Literal---String s = "Java"
	//Each time you create a string literal, the JVM checks the "string constant pool" first.
	//If the string already exists in the pool, a reference to the pooled instance is returned. 
	//If the string doesn't exist in the pool, a new string instance is created and placed in the pool. 
	//Note: String objects are stored in a special memory area known as the "string constant pool".
	//For example:
	//String s1 = "welcome";
	//String s2 = "welcome";//it doesn't create a new instance in "string constant pool"
	//Why Java uses the concept of String literal?
	//To make Java more memory efficient (because no new objects are created 
	//if it exists already in the string constant pool).
	//By new keyword---String s=new String("Welcome");//creates two objects and one reference variable  
	//In such case, JVM will create a new string object in normal (non-pool) heap memory, 
	//and the literal "Welcome" will be placed in the string constant pool. 
	//The variable s will refer to the object in a heap (non-pool).
	//Why are string object are immutable?
	//In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
	//Once string object is created its data or state can't be changed but a new string object is created.
	//Why string objects are immutable in java?
	//Because java uses the concept of string literal.Suppose there are 5 reference variables,
	//all referes to one object "sachin".If one reference variable changes the value of the object, 
	//it will be affected to all the reference variables. That is why string objects are immutable in java.
		
	public static void main(String[] args) {
	 String s = "Mahmud";
	 s.concat("Nurul");//concat method appends the string at the end
	 System.out.println(s);//will print Mahmud because strings are immutable objects  
	 
	 String s1= new String("Nurul");
	 s1.concat("Mahmud");
	 System.out.println(s1);
	}

}
