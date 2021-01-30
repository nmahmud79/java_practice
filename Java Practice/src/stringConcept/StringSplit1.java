package stringConcept;

public class StringSplit1 {

	public static void main(String[] args) {
		
		System.out.println("*********1st Print*********");
		String str = "I Love America";
		String[] a=str.split("\\s");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("\n**********2nd Print*********");
		
		String s1= "java string split method by javatpoint";
		String[] word= s1.split("\\s");
		
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
		System.out.println("\n**********3rd Print*********");
		
		String s2= "Welcome to the split world";
		String [] word1= s2.split("\\s", 0);
		System.out.println("After split--returing words are-0:");
		for (int i = 0; i < word1.length; i++) {
			System.out.println(word1[i]);
		}
		
		String [] word2= s2.split("\\s", 1);
		System.out.println("\nAfter split--returing words are-1:");
		for (int i = 0; i < word2.length; i++) {
			System.out.println(word2[i]);
		}
		
		String [] word3= s2.split("\\s", 2);
		System.out.println("\nAfter split--returing words are-2:");
		for (int i = 0; i < word3.length; i++) {
			System.out.println(word3[i]);
		}
		
		String [] word4= s2.split("\\s", 3);
		System.out.println("\nAfter split--returing words are-3");
		for (int i = 0; i < word4.length; i++) {
			System.out.println(word4[i]);
		}
		
		String [] word5= s2.split("\\s", 4);
		System.out.println("\nAfter split--returing words are-4");
		for (int i = 0; i < word5.length; i++) {
			System.out.println(word5[i]);
		}
		
		String [] word6= s2.split("\\s", 5);
		System.out.println("\nAfter split--returing words are-5");
		for (int i = 0; i < word6.length; i++) {
			System.out.println(word6[i]);
		}
		
		String [] word7= s2.split("\\s", 6);
		System.out.println("\nAfter split--returing words are-6");
		for (int i = 0; i < word7.length; i++) {
			System.out.println(word7[i]);
		}

	}

}
