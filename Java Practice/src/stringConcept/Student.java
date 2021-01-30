package stringConcept;

public class Student {
	
	//Java toString() method
	//If you want to represent any object as a string, toString() method comes into existence.
	//The toString() method returns the string representation of the object.
	//If you print any object, java compiler internally invokes the toString() method on the object. 
	//So overriding the toString() method, returns the desired output, 
	//it can be the state of an object etc. depends on your implementation.
	//Advantage of Java toString() method
	//By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.

		 int rollno;  
		 String name;  
		 String city;  
		  
		 Student(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		 //toString method for printing the value of variables (roll, name, city)
		 public String toString(){//overriding the toString() method  
		 return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
		 Student s1=new Student(101,"Raj","lucknow");  
		 Student s2=new Student(102,"Vijay","ghaziabad");  
		     
		 System.out.println(s1);//compiler writes here s1.toString()  
		 System.out.println(s2);//compiler writes here s2.toString()  
	}

}
