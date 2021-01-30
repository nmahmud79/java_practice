package wrapperClass;

public class Demo {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		System.out.println("***********double********");
		
		String y = "12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		System.out.println("***********boolean********");
		String z="true";
		boolean b=Boolean.parseBoolean(z);
		System.out.println(b);
		
		System.out.println("\n");
		int f= 100;
		System.out.println(f+10);
		String s=String.valueOf(f);
		System.out.println(s+20);
		
		int n = 200;
		Integer m=Integer.valueOf(n);
		Integer r=m;
		System.out.println(n+" "+m+" "+r);
		
		System.out.println("****Integer to int****");
		
		Integer u = new Integer(5);
		int v=u.intValue();
		int w=v;
		System.out.println(u+" "+v+" "+w);
		

	}

}
