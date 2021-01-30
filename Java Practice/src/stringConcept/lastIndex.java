package stringConcept;

public class lastIndex {
	
	//	Java String lastIndexOf()
	//The java string lastIndexOf() method returns last index of the given character value or substring. 
	//If it is not found, it returns -1. The index counter starts from zero.
	
	public static void main(String[] args) {
		
		//int lastIndexOf(int ch)----returns last index position for the given char value
		String s1="this is index of example";//there are 2 's' characters in this sentence  
		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6
		
		System.out.println("********************");
		//int lastIndexOf(int ch, int fromIndex)---returns last index position for the given char value and from index
		System.out.println();	
		String str = "This is index of example";  
        int index = str.lastIndexOf('s',5);  
        System.out.println(index); 
        
    	System.out.println("********************");
        //int lastIndexOf(String substring)---returns last index position for the given substring
        String str1 = "This is last index of example";  
        int indeX = str1.lastIndexOf("of");  
        System.out.println(indeX);  
        
    	System.out.println("********************");
        //int lastIndexOf(String substring, int fromIndex)---returns last index position for the given substring and from index
    	 String str2 = "This is last index of example";  
         int indexO = str.lastIndexOf("of", 25);  
         System.out.println(indexO);  
         indexO = str.lastIndexOf("of", 10);  
         System.out.println(indexO); // -1, if not found     
    	
    	
    	
    	
	}

}
