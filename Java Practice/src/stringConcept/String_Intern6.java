package stringConcept;

public class String_Intern6 {
	//if we want to store any heap object inside the String Constant Pool area forcefully then we will use intern() method. 
	//Java String intern() method is used for getting the string from the memory if it is already present.
	//This method ensures that all the same strings share the same memory. 
	//It can be used to return string from memory, if it is created by new keyword. It creates exact copy of heap string object in string constant pool. 
	//For example, creating a string “hello” 10 times using intern() method would ensure that 
	//there will be only one instance of “hello” in the memory and all the 10 references point to the same instance.
	public static void main(String[] args) {
		//String s=new String("Sachin");  
		String s = "Sachin";
		String s2 = new String("Sachin").intern();
		//String s2=s.intern();  
		System.out.println(s2);//Sachin  
		System.out.println(s==s2);//true
		
		System.out.println("\n"+"-------------------");
		String str = "beginnersbook";    
		String str9 = new String("beginnersbook").intern(); 
		//prints true 
		System.out.println("str==str9: "+(str==str9));
		
		System.out.println("\n"+"-------------------");
		String str1 = "Hello";
		
		//Java automatically interns this	
		String str2 = "Hello";
			
		//This is same as creating string using string literal		
		String str3 = "Hello".intern();
			
		//This will create a new instance of "Hello" in memory
		String str4 = new String("Hello");
			
		if ( str1 == str2 ){
		    System.out.println("String str1 and str2 are same");
		}

		if ( str2 == str3 ){
		    System.out.println("String str2 and str3 are same" );
		}

		if ( str1 == str4 ){
		    //This will not be printed as the condition is not true
		    System.out.println("String str1 and str4 are same" );  
		}

		if ( str3 == str4 ){
		    System.out.println("String str3 and str5 are same" );  
		}

	}

}
