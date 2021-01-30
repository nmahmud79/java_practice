package Class_Object_Concept;

public class Test {

	public static void main(String[] args) {
		
		//Teacher t1;//Object declared
		//t1= new Teacher();//Object created
		System.out.println("\n 1st Object-----");
		Teacher t1 = new Teacher();
		t1.name= "Nurul Mahmud";
		t1.gender= "Male";
		t1.phone= 17150;
		
		System.out.println("Name :"+t1.name);
		System.out.println("Gender :"+t1.gender);
		System.out.println("Phone :"+t1.phone);
		
		System.out.println("\n 2nd Object-----");
		Teacher t2 = new Teacher();
		t2.name= "Nurul Mashud";
		t2.gender= "Male";
		t2.phone= 17151;
		
		System.out.println("Name :"+t2.name);
		System.out.println("Gender :"+t2.gender);
		System.out.println("Phone :"+t2.phone);
	}

}
