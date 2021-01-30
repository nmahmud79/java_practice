 package ClassObject;

//Class is the final building block of Java where we have to define the properties
//properties means number of variables and methods
//What is variables and methods--are characteristics of any particular class
//my name is Mahmud..I am a Class...human Class...
//What are my properties....i can walk, i can talk, i can sleep, i can eat...These are my characteristis or properties
//So class is an entity where number properties are there. 
//We have to define the number properties by number of method and variables 
//A class is a group of objects that has common properties
//A class in java contains---data member, method, constructor, block, class & interface
public class Car {
	//global variables
	int model;
	int wheel;

	public static void main(String[] args) {
		
		//create the object of this particular class
		//object means you have create physical entity of this Car class
		
		//new Car()---this is the object of the Car class.
		//new keyword is used to create the object
		//a,b,c are----object reference variables 
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model=2015;
		a.wheel=4;
		
		b.model=2016;
		b.wheel=6;
		
		c.model=2017;
		c.wheel=8;
		
		System.out.println("\n"+"before assigning the references :");
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("\n"+"after assigning the references :");
		
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model);//10
		c.model=20;
		System.out.println(a.model);//20
		System.out.println(c.model);

	}

}
