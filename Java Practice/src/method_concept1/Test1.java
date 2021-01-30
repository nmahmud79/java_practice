package method_concept1;

public class Test1 {
	
	public static void main(String[] args) {
		Teacher1 t1= new Teacher1();
		t1.setInformation("Nurul", "Male", 40);//Nurul is going to n and n=name;
		t1.displayInformation();
		
		Teacher1 t2= new Teacher1();
		t2.setInformation("Mahmud", "Male", 30);
		t2.displayInformation();
		
		Teacher1 t3= new Teacher1();
		t3.setInformation("Jhon", "Male", 25);
		t3.displayInformation();
	}

}
