   package stringConcept;
		//The java string indexOf() method returns index of given character value or substring.
		//If it is not found, it returns -1. The index counter starts from zero.
		//int indexOf(int ch)---returns index position for the given char value
		//int indexOf(int ch, int fromIndex)---returns index position for the given char value and from index
		//int indexOf(String substring)---returns index position for the given substring
		//int indexOf(String substring, int fromIndex)---returns index position for the given substring and from index
public class String_IndexOf5 {

	public static void main(String[] args) {
		
		System.out.println("\nJava String indexOf() method example:\n");
		String s1= "this is index of example";
		//passing substring
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+" "+index2);//2 8
		
		//passing substring with index from
		int index3=s1.indexOf("is", 4);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3 
		
		System.out.println("\nJava String indexOf(String substring) Method Example:\n");
		String s2= "This is the indexOf method";
		//passing substring
		int index5=s2.indexOf("method");////Returns the index of this substring  
		System.out.println("index of substring :"+index5);  
		
		System.out.println("\nJava String indexOf(String substring, int fromIndex) Method Example:\n");
		String s3 = "This is indexOf method";         
        // Passing substring and index  
        int index6 = s3.indexOf("method", 10); //Returns the index of this substring  
        System.out.println("index of substring "+index6);  
        index6 = s3.indexOf("method", 20); // It returns -1 if substring does not found  
        System.out.println("index of substring "+index6);   
        
        System.out.println("\nJava String indexOf(int char, int fromIndex) Method Example:\n");
        //This method takes char and index as arguments and returns index of first character occured after the given fromIndex.
        String s4 = "This is indexOf method";         
        // Passing char and index from  
        int index7 = s1.indexOf('e', 12); //Returns the index of this char  
        System.out.println("index of char "+index7);       

	}

}
