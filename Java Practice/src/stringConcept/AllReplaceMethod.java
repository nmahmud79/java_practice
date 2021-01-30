package stringConcept;

public class AllReplaceMethod {

		
	//replace(), replaceFirst()and replaceAll() methods. 
	//All of these Java String methods are mainly used for replacing a part of String with another String.
	//Java String replace method signature:
	//String replace(char oldChar, char newChar): 
	//It replaces all the occurrences of a oldChar character with newChar character. For e.g. "pog pance".replace('p', 'd') would return dog dance.
	//String replaceFirst(String regex, String replacement): 
	//It replaces the first substring that fits the specified regular expression with the replacement String. 
	//PatternSyntaxException if the specified regular expression(regex) is not valid.
	//String replaceAll(String regex, String replacement): It replaces all the substrings that fits the given regular expression with the replacement String.

	public static void main(String[] args) {
		System.out.println("1st Example----------");
		String s1="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString);    
		
		System.out.println("2nd Example----------");
		String str = new String("Site is BeginnersBook.com");

		System.out.print("String after replacing all 'o' with 'p' :" );
		System.out.println(str.replace('o', 'p'));

		System.out.print("String after replacing all 'i' with 'K' :" );
		System.out.println(str.replace('i', 'K'));

	}

}
