package stringConcept;

public class StringEmpty {

	public static void main(String[] args) {
		
		String s = "America is a land of opportunity";
		boolean b=s.contains("land");
		boolean c=s.contains("andl");
		System.out.println("1st ="+b);
		System.out.println("2nd ="+ c);
		
		System.out.println("\n"+"---------------------------");
        String str = "To learn Java visit Javatpoint.com";      
        if (str.contains("javatpoint.com")) {
			System.out.println("This string contains Javatpoint.com");
		} else {
			System.out.println("Result not found");
		}
        
        System.out.println("\n"+"---------------------------");
        
        String s2= "To learn java visit javatpoint.com";
        boolean d=s2.contains("visit");
        System.out.println(d);
	}

}
