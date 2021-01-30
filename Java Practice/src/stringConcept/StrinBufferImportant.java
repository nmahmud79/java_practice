package stringConcept;

public class StrinBufferImportant {

	
	//Java StringBuffer class:
	//Java StringBuffer class is used to create mutable (modifiable) string. 
	//The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
	//Is synchronized
	//Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. 
	//So it is safe and will result in an order.
	//What is mutable string?
	//A string that can be modified or changed is known as mutable string. 
	//StringBuffer and StringBuilder classes are used for creating mutable string
	//Important Constructors of StringBuffer class:
	//StringBuffer()---creates an empty string buffer with the initial capacity of 16.
	//StringBuffer(String str)---	creates a string buffer with the specified string.
	
	//Java StringBuilder class
	//Java StringBuilder class is used to create mutable (modifiable) string. 
	//The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.
	
	//Difference of String and StringBuffer
	//String is immutable where String Buffer is mutable.
	//String is slow and consumes more memory when you concat too many strings because every time it creates new instance.
	//StringBuffer is fast and consumes less memory when you cancat strings.
	//String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.
	//StringBuffer class doesn't override the equals() method of Object class.
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");  
		//The append() method concatenates the given argument with this string.
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  

	}

}
