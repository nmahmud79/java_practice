  package data_concept;

  	//Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:
  	//Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
  	//Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

  	//There are 8 types of primitive data types:

  	//boolean data type---false------1 bit--------Stores true or false values
  	//byte data type------0----------1 byte-------Stores whole numbers from -128 to 127
  	//char data type------'\u0000'---2 byte-------Stores a single character/letter or ASCII values
  	//short data type-----0----------2 byte-------Stores whole numbers from -32,768 to 32,767
  	//int data type-------0----------4 byte-------Stores whole numbers from -2,147,483,648 to 2,147,483,647
  	//long data type------0L---------8 byte-------Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
  	//float data type-----0.0f-------4 byte-------Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
  	//double data type----0.0d-------8 byte-------Stores fractional numbers. Sufficient for storing 15 decimal digits
  
  	//The Boolean data type is used to store only two possible values: true and false. This data type is used for simple flags that track true/false conditions.
  	//Strings: The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
public class Data_Demo {
		
	public static void main(String[] args) {
		//The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
		System.out.println("\n");
		char myGrade = 'B';
		System.out.println(myGrade);
		
		System.out.println("\n");
		char a= 65, b= 66, c=67;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//The ASCII Character Set
		//ASCII stands for the "American Standard Code for Information Interchange".
		
		System.out.println("\nString :");
		String name = "Nurul Mahmud";
		System.out.println(name);
	}

}
