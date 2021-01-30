package stringConcept;

public class ToCharArray {

	public static void main(String[] args) {
		
		String s = "Welcome to Coding World";
		
		char[] ch= s.toCharArray();
		
		System.out.println("The lenth :"+ch.length);
		
		System.out.println("Contain letter as under:");
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

}
