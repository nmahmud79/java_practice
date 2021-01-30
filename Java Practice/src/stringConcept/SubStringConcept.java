package stringConcept;

public class SubStringConcept {
	//A part of string is called substring. In other words, substring is a subset of another string. 
	//In case of substring startIndex is inclusive and endIndex is exclusive.
	//Index start from 0
	//subString is always endIndex-startIndex
	public static void main(String[] args) {
		
		System.out.println("1st example :"+"\n");
		String str= new String("quick brown fox jumps over the lazy dog");
	       System.out.println("Substring starting from index 17:");
	       System.out.println(str.substring(17));
	       System.out.println("Substring starting from index 15 and ending at 20:");
	       System.out.println(str.substring(17, 23));
		
	    System.out.println("2nd example :"+"\n");
	    
	    String mystring = new String("Lets Learn Java");
		/* The index starts with 0, similar to what we see in the arrays
		 * The character at index 0 is s and index 1 is u, since the beginIndex
		 * is inclusive, the substring is starting with char 'u'
		 */
		System.out.println("substring(1):"+mystring.substring(1));
			
		/* When we pass both beginIndex and endIndex, the length of returned
		 * substring is always endIndex - beginIndex which is 3-1 =2 in this example
		 * Point to note is that unlike beginIndex, the endIndex is exclusive, that is 
		 * why char at index 1 is present in substring while the character at index 3 
		 * is not present.
		 */
		System.out.println("substring(1,3):"+mystring.substring(1,3));
	}

}
