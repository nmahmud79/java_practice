package wrapperClass;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		
		//data conversion: String to int
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		//Wrapper class in java provides the mechanism to convert primitive into object and object into primitive
		//autoboxing and unboxing 
		
		//String to double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string conversion
		int j = 100;
		System.out.println(j+20);
		
		String s =String.valueOf(j);
		System.out.println(s+20);
		
		//converting int into Integer
		int c = 20;
		Integer m = Integer.valueOf(c);//converting int into Integer explicitly
		Integer n=m;//autoboxing, now compiler will write Integer.valueOf(c) internally
		System.out.println(c+" "+m+" "+n);
		
		//converting Integer into int
		Integer f = new Integer(3);
		int p= f.intValue();//converting Integer into int explicitly
		Integer q=p;//unboxing, now compiler will write intValue() internally
		System.out.println(d+" "+p+" "+q);
		
		System.out.println("***************************");
		
		String h []= {"10", "20"};
		System.out.println("before sum:"+h[0]+h[1]);
		int h1=Integer.parseInt(h[0]);
		int h2=Integer.parseInt(h[1]);
		int h3=h1+h2;
		System.out.println("after sum:"+h3);
		
		
		String a = "100A";//numberFormatException---for input string "100A";
		int a1=Integer.parseInt(a);
		System.out.println(a1);
		
}
	
}
