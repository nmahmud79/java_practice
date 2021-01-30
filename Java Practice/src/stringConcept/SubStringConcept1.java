package stringConcept;

public class SubStringConcept1 {

	public static void main(String[] args) {
		
		System.out.println("\n*****example-1*****");
		String s1= "javatpoint";
		String w=s1.substring(2);
		String w1=s1.substring(2, 4);
		System.out.println(w);//returns vatpoint because start-index is inclusive and end-index is exclusive
		System.out.println(w1);//returns va
		
		System.out.println("\n*****example-2*****");
		String s2= "javatpoint";
		String w2=s2.substring(0);//Starts with 0 and goes to end 
		System.out.println(w2);
		String w3=s2.substring(5, 10);//Starts from 5 and goes to 10 
		System.out.println(w3);
		String w4=s2.substring(5, 15);//Returns Exception
		System.out.println(w4);
	}

}
