  package stringConcept;

public class String_Contains4 {

	//Java String contains() method checks whether a particular sequence of characters is part of a given string or not.
	//This method returns true if a specified sequence of characters is present in a given string, otherwise it returns false.
	//Syntax---public boolean contains(CharSequence s)
	public static void main(String[] args) {
		
		String s = "Game of Thrones";
		
		//This will print "true" because "Game" is present in the given String
		System.out.println(s.contains("Game"));

		/* This will print "false" because "aGme" is not present, the characters
		 * must be present in the same sequence as specified in the contains method
		 */
		System.out.println(s.contains("aGme"));

		System.out.println("\n"+"---------------------------");
        String str = "To learn Java visit Javatpoint.com";        
        if(str.contains("Javatpoint.com")) {  
            System.out.println("This string contains Javatpoint.com");  
        }else  
            System.out.println("Result not found");  
        
        System.out.println("\n"+"---------------------------");
        
        String s2= "To learn java visit javatpoint.com";
        
        boolean isContains = s2.contains("visit");
        System.out.println(isContains);
       }

}
 