package stringConcept;

public class String_Join7 {
	
	//String join()
	//The java string join() method returns a string joined with given delimiter.
	//In string join method, delimiter is copied for each elements.
	//In case of null element, "null" is added. The join() method is included in java string since JDK 1.8.
	//There are two types of join() methods in java string.
	public static void main(String[] args) {
		
		String s=String.join("-","welcome","to","javatpoint");  
		System.out.println(s);  
		
		
		String date = String.join("/","25","06","2018");    
	    System.out.print(date);    
	    String time = String.join(":", "12","10","10");  
	    System.out.println(" "+time);  
	    } 
	
		}
	
		
	
	
	

