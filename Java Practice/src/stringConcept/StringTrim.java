package stringConcept;

public class StringTrim {

	//The string trim() method eliminates white spaces before and after string.
	public static void main(String[] args) {
		
		String s = " Sachin ";
		System.out.println("after removing space: "+s.trim());
		
		System.out.println("----------------------------------");
		System.out.println("The string charAt() method returns a character at specified index.");
		String s1= "NURUL";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(4));
		//System.out.println(s1.charAt(-1));negative index, method would throw exception
		
		System.out.println("\n"+"----------------------------------");
		System.out.println("The string length() method returns length of the string.");
		String s3 = "Nurul Mahmud";
		System.out.println(s3.length());
		
		System.out.println("\n"+"----------------------------------");
		System.out.println("The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String");
		int a =10;
		String s4 = String.valueOf(a);
		System.out.println(s4+10);
		
		System.out.println("---------------------");
		char vowel[] = {'A', 'E', 'I', 'O', 'U'}; 
		String str = String.valueOf(vowel);  
		System.out.println(str); 
	}

}
