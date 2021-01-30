package finallyFinalizeDemo;

//							"final keyword"
//The final keyword in java is used to restrict the user
//Final keyword at Variable Level (Restrict changing values of variable)
//Final keyword at Method Level (Restrict method overriding)
//Final keyword at Class Level (Resitrict Inheritance/Can't extend it)
//A final variable that is not initialized at the time of declaration is known as blank/uninitialized final variable. 
//We must initialize the blank final variable only in constructor of the class otherwise it will throw a compilation error.
//All variables declared in an interface are by default final.
//Is final method inherited?
//Yes, final method is inherited but you cannot override it.
//Can we declare a construtor final?
//No, because constructor is never inherited.

//							"finally block"
//Execute code after try---catch, no matter if there is an exception or not.
//A finally block must be associated with a try block, you cannot use finally without a try block. 
//You should place those statements in this block that must be executed always.
//Finally block is optional, a try-catch block is sufficient for exception handling,
//however if you place a finally block then it will always run after the execution of try block.
//In normal case when there is no exception in try block then the finally block is executed after try block.
//However if an exception occurs then the catch block is executed before finally block.
//The statements present in the finally block execute even if the try block contains control transfer statements
//like return, break or continue.
//For each try block there can be zero or more catch blocks, but only one finally block.
//Finally block will not be executed if program exits(either by calling System.exit).


//							"finalize method"
//finalize is a method that is called by JVM during garbage collection.
//finalize is something related to garbage collection. Finalize is used to perform for clean up memory processing.
//Inside the memory, there are lot of garbage is there, lot of objects is there with doesn’t have references.

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("finalize method");
	}
	public static void main(String[] args) {
		
		FinalizeConcept fConcept = new FinalizeConcept();
		FinalizeConcept fConcept2 = new FinalizeConcept();
		
		fConcept = null;
		fConcept2 = null;
		
		System.gc();
	}

}
