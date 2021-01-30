package stringConcept;

public class String_valueOf {

	public static void main(String[] args) {
		int value = 30;
		String s1=String.valueOf(value);
		System.out.println(s1+30);
		
		System.out.println("\nboolean :");
		boolean b1= true;
		boolean b2= false;
		String s2=String.valueOf(b1);
		String s3= String.valueOf(b2);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("\nchar ch :");
		char ch1= 'A';
		char ch2= 'B';
		String s4=String.valueOf(ch1);
		String s5=String.valueOf(ch2);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println("\nfloat & double :");
		float fl= 10.05f;
		double dl= 10.11;
		String s6=String.valueOf(fl);
		String s7=String.valueOf(dl);
		System.out.println(s6);
		System.out.println(s7);
		
		System.out.println("\nchar :");
		char [] ch = {'j','a','v','a'};
		String s8=String.valueOf(ch);
		System.out.println(s8);

	}

}
