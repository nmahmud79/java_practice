package stringConcept;

public class StringSplit {

	//Java String split() Method with examples
	//The java string split() method splits this string against given delimiter/ regular expression and returns a char array.
	//We have two variants of split() method in String class.
	//1. String[] split(String regex): It returns an array of strings after splitting an input String based on the delimiting regular expression.
	//2.String[] split(String regex, int limit): This Java String split method is used when we want the substrings to be limited.
	//The only difference between this method and above method is that it limits the number of strings returned after split up. 
	//For e.g. split("anydelimiter", 3) would return the array of only 3 strings even if the delimiter is present in the string more than 3 times.
	
	public static void main(String[] args) {
		
		System.out.println("*********1st Print*********");
		String str = "I Love America";
		String[] a=str.split("\\s");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		
		System.out.println("\\n************2nd Print********");
		String s = "java string split method by javatpoint";  
		String[] word = s.split("\\s");//split the string based on white space
		//using java for each loop to print elements of string array 
		for (String w: word) {
			System.out.println(w);			
		}
		
		System.out.println("\n"+"example-2-----------");
		
		String s1 = "Welcome to split world";
		System.out.println("returning words-1:");
		
		for (String w1 : s1.split(" ", 0)) {
			System.out.println(w1);
			
		} 
		
		System.out.println("returning words-2:");
		
		for (String w1 : s1.split(" ", 1)) {
			System.out.println(w1);
		
		} 
		
		System.out.println("returning words-3:");
		
		for (String w1 : s1.split(" ", 2)) {
			System.out.println(w1);
			
		}
		
		System.out.println("\n"+"example-3-----------");
		
		String str1 = "javatpointtt";
		System.out.println("returning words:");
		String[] arr = str1.split("t", 0);
		for (String w : arr) {  
            System.out.println(w);
            
        }
		System.out.println("Split array length: "+arr.length); 
		} 
	}
}


