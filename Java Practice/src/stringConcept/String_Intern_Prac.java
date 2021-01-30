package stringConcept;

public class String_Intern_Prac {
	
	public static void main(String[] args) {
		
		
		//String s1= "javatpoint";
		//String s2= s1.intern();
		//String s3= new String("javatpoint");
		//String s4= s3.intern();
		//System.out.println(s1==s2);
		//System.out.println(s1==s3);
		//System.out.println(s1==s4);
		//System.out.println(s2==s3);
		//System.out.println(s2==s4);
		//System.out.println(s3==s4);
		
		String s1= "javatpoint";
		String s2= s1.intern();
		String s3= new String("javatpoint");
		String s4= s3.intern();
		
		if (s1==s2) {
			System.out.println("String s1 and s2 are same");
		}
		if (s1==s3) {
			System.out.println("String s1 and s3 are same");
		} else {
			System.out.println("String s1 and s3 are not same");
		}
		if (s1==s4) {
			System.out.println("String s1 and s4 are same");
		}
	
	
	
	
}	

}
