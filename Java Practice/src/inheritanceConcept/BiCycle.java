package inheritanceConcept;


//								INHERITANCE
//						**************************
//•	When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
//OR
//•	Is the process where one class acquires the properties of (methods & fields) another.
//•	extends is the keyword used to inherit the properties of a class. 
//•	Why do we need Inheritance? 
//•	1. Code re-usability 2. Method overriding (used for run time polymorphism) 
//3. To implement parent-child relationship.
//•	Multi-level inheritance is allowed in Java but not multiple inheritance
//• The concept of inheritance is also known as re-usability or extendable classes or sub classing or derivation.
//• Java support multilevel inheritance not multiple inheritance.
//• Types of inheritance:
//• 1. Single inheritance 2. Multiple inheritance and 3.Hierarchical inheritance.
//• >>>Note: A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
//Constructors are not members, so they are not inherited by subclasses, 
//but the constructor of the superclass can be invoked from the subclass<<<

public class BiCycle {
	
	//the BiCycle class has two fields
	public int gear;
	public int speed;
	
	//the BiCycle class has one constructor
		public BiCycle(int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
	}
		
	//the BiCycle class has three methods
		public void applyBrake(int decrement) {
			speed-=decrement;
		}
		
		public void speedUp(int Increment) {
			speed+=Increment;
		}
		
		//toString method to print info of BiCycle
		
		public String toString() {
			return ("No. of gear :"+ gear+"\n"+"Speed of BiCyle :"+speed);
		}
}
