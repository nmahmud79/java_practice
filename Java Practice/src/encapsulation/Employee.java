package encapsulation;


//							ENCAPSULATION
//						*********************
//Encapsulation is a process of wrapping of data and methods in a single unit and 
//protecting data by declaring them as a private.
//Private data will be hidden from other classes and they can only be accessed through
//the method of their current classes, this is called data hiding.
//How to do Encapsulation? 
//1) Declare the variable as private---so that these variables cannot be accessed directly from outside of the class 
//2) Provide public getter and setter method to SET AND GET THE VALUES OF VARIABLES/FIELDS. 
//The get method returns the variable value, and the set method sets the value.
//Benefits of Encapsulation:
//1) Provides data hiding. 2)Re-usability 3) Code can be modified without breaking the code. 

public class Employee {
	
	private String empName;
	private int empAge;
	private int empSsn;
 		
	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.setEmpName("Nurul Mahmud");
		emp.setEmpAge(39);
		emp.setEmpSsn(123456789);
		
		System.out.println("Employee Name is :"+emp.getEmpName());
		System.out.println("Employee Age is :"+emp.getEmpAge());
		System.out.println("Employee SSN is :"+emp.getEmpSsn());
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public int getEmpSsn() {
		return empSsn;
	}

	public void setEmpSsn(int empSsn) {
		this.empSsn = empSsn;
	}

	}
