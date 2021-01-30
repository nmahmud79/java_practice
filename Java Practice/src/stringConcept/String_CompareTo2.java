package stringConcept;

public class String_CompareTo2 {

	//There are three ways to compare string in java:
	//1.By equals() method 2.	By = = operator and 3. By compareTo() method
	//1st Method: String compare by equals method
	//The String equals() method compares the original content of the string. 
	//>>It compares values of string for equality. String class provides two methods:
	//>>public boolean equals(Object another) compares this string to the specified object.
	//>>public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.
	// If any character is not matched, it returns false. If all characters are matched, it returns true.
	//The String equals() method overrides the equals() method of Object class.
	public static void main(String[] args) {
		
		System.out.println("Compare this string to the specified object :"+"\n");
		String s1 = "Mahmud";
		String s2 = "Mahmud";
		String s3 = new String("Mahmud");
		String s4 = "Nurul";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println("\n");
		
		//The Java String compareTo() method is used for comparing two strings lexicographically.
		//Each character of both the strings is converted into a Unicode value for comparison.
		//If both the strings are equal then this method returns 0 else it returns positive or negative value. 
		//The result is positive if the first string is lexicographically greater than the second string else the result would be negative.
				
			String s5= "hello";
			String s6= "hello";
			String s7= "nurul";
			String s8= "mahmud";
			String s9= "java";
			
			System.out.println(s5.compareTo(s6));
			System.out.println(s2.compareTo(s7));
			System.out.println(s2.compareTo(s8));
			System.out.println(s2.compareTo(s9));
			System.out.println("\n");
			
			String s10= "Cow";
			String s11= "";
			String s12= "Goat";
			System.out.println(s10.compareTo(s11));
			System.out.println(s10.compareTo(s12));
	}
	
	

}
