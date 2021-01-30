package stringConcept;

public class CharAt1 {

	public static void main(String[] args) {
		
		String s = "sout";
		
		//charAt() returns a char value at the given index number
		//index number start from 0 and goes to n-1. n is the length of the string. 
		char ch =s.charAt(2);
		System.out.println(ch);
		System.out.println(s.charAt(s.length()-1));
		
		System.out.println("\n*****odd index****");
		String s1= "welcome to java world";
		for (int i=0; i<=s1.length()-1; i++) {
			if (i%2!=0) {
			System.out.println("Char at"+" "+i+" place "+"is-"+s1.charAt(i));	
			}
		}
		System.out.println("\n*****counting frequency of a character in the string****");
		String s2 = "welcome to java website";
		int count =0;
		for (int i = 0; i<=s2.length()-1; i++) {
			if (s2.charAt(i)=='t') {
				count++;
			}
		}
		System.out.println("Frequency of t is :"+count);
	}

}
