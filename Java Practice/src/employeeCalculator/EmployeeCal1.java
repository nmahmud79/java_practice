package employeeCalculator;

import java.util.Scanner;

public class EmployeeCal1 {
	
	public static void main(String[] args) {
	
		String nameOfEmployee;
		double numberOfHourWorked;
		double hourlyPayRate;
		double grossPay;
		
		System.out.println("Welcome to EMP Cal----Please follow the instruction----");
		System.out.println("");
		System.out.println("");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Employee Name: ");
		nameOfEmployee = scan.nextLine();
		
		System.out.println("Enter Employee Total Hour: ");
		numberOfHourWorked = scan.nextDouble();
		
		System.out.println("Enter Employee Hourly Pay Rate: ");
		hourlyPayRate = scan.nextDouble();
		
		grossPay = numberOfHourWorked*hourlyPayRate;
		
		System.out.println("");
		System.out.println("==============================================================");
		System.out.println("Employee Name is: "+nameOfEmployee);
		System.out.println("Employee Total Hour is: "+numberOfHourWorked);
		System.out.println("Employee Hourly Rate is: "+hourlyPayRate);
		System.out.println("Employee Gross is: "+grossPay);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Thank You for using the claculator.....!!!!");
		
		

	}

}
