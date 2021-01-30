package method_concept1;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("1st Object-----");
		Teacher t1= new Teacher();
		t1.name="Nurul Mahmud";
		t1.gender="Male";
		t1.age=40;
		t1.displayInformation();//using method we just reduce the 3 line of code 
		
		
		System.out.println("2nd Object-----");
		Teacher t2= new Teacher();
		t2.name="Nurul Mashud";
		t2.gender="Male";
		t2.age=35;
		t2.displayInformation();//using method we just reduce the 3 line of code 
		
		System.out.println("3rd Object-----");
		Teacher t3= new Teacher();
		t3.name="Nurul Mamun";
		t3.gender="Male";
		t3.age=40;
		t3.displayInformation();//using method we just reduce the 3 line of code 

	}

}
