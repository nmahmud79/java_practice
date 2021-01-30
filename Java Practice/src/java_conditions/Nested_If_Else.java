package java_conditions;
		//Java Program to demonstrate the use of Nested If Statement. See Javatpoint   

		//Java Nested if statement
		//The nested if statement represents the if block within another if block.>>
		//Here, the inner if block condition executes only when outer if block condition is true.
public class Nested_If_Else {

	public static void main(String[] args) {
		
		int age= 20;
		int weight =80;
		
		if (age>=18) {
			if (weight>50) {
			System.out.println("You are eligible to donate blood");  	
			}
		}
		
			System.out.println("\n2nd example");
			   int age1=25;    
			   int weight1=48;      
			   //applying condition on age and weight    
			   if(age1>=18){      
			        if(weight1>50){    
			            System.out.println("You are eligible to donate blood");    
			        }else{  
			            System.out.println("You are not eligible to donate blood");    
			        }  
			   }else{  
			      System.out.println("Age must be greater than 18");  
			   } 
	}

}
