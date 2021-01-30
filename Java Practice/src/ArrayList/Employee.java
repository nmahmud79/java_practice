package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

//how to define user define class object Arraylist?
public class Employee {
	
	String name;
	int age;
	String dept;
	
	Employee(String name, int age, String dept) {
		
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
	public static void main(String[] args) {
	
	//Create Employee class object:
	Employee e1 = new Employee("Nurul", 40, "QE");
	Employee e2 = new Employee("Mahmud", 35, "Deb");
	Employee e3 = new Employee("Hasan", 30, "Design");
	
	//Create array list
	ArrayList<Employee> empl = new ArrayList<Employee>();
	empl.add(e1);
	empl.add(e2);
	empl.add(e3);
	
	//iterate to traverse the values
	Iterator<Employee> it = empl.iterator();
	while (it.hasNext()) {
		Employee employee = (Employee) it.next();
		
		System.out.println(employee.name);
		System.out.println(employee.age);
		System.out.println(employee.dept);
		
		
	}

}
}