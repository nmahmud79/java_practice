 package arrayDemo;

//Array:to store similar data type values in array variable;
 //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//lowest bound/index=0;
//highest bound/index=(n-1) (n is size of array)
//Advantage: One variable can store multiple value
//disadvantage: size is fixed---static array--to overcome this we use collections--Arraylist, Hash Table
//store similar data types value---to overcome this we use object array.
//No, need to declare a lot of variable of same type data
//Random access: We can retrieve any data from array with the help of the index value.
//add elements with the help of assignment operator
//does not supprot generic i.e. not type safe

public class arrayConcept {

	public static void main(String[] args) {
		
		//int i=20;//duplicate variable is not allowed
		//int i=10;
		//i=10; at a time i can store only one value
			
		int[]a = new int[5];//declaration and instantiation  
		
		a[0]=10;//initialization  
		a[1]=20;
		a[2]=30;
		a[3]=40;
		//a[4]=50;
  		a[4]='A';
				
		System.out.println(a[2]);
		//System.out.println(a[5]);//means 6th value that does not exisit that gives, ArrayIndexOutOfBoundsException
		
		//print all the values of array: use for loop concept
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("*******double********");
		double[] d = new double[3];
		
		d[0]=11.11;
		d[1]=22.22;
		d[2]=33.33;
		System.out.println(d[1]);
		
		System.out.println("*******char********");
		
		char[] c= new char[3];
		c[0]='z';
		c[1]='e';
		c[2]='a';
		
		System.out.println(c[0]);
		
		
		System.out.println("*******string********");
		
		String [] s = new String[3];
		
		s[0]= "mahmud";
		s[1]="nurul";
		s[2]="Nurul Mahmud";
		
		System.out.println(s.length);
		
		System.out.println("*******object********");
		//object array is used to store differnt types value
		Object [] obj = new Object[6];
		
		obj[0]= "Nurul";
		obj[1]= 123;
		obj[2]= "London";
		obj[3]= 12.33;
		obj[4]= "1/1/1900";
		obj[5]= 'M';
		System.out.println(obj.length);
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		
	}

}
