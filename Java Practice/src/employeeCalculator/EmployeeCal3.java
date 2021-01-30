package employeeCalculator;

import java.util.Scanner;

public class EmployeeCal3 {
	
		static String nameOfEmployee;
		static double numberOfHourWorked;
		static double hourlyPayRate;
		static double grossPay;
		static double netPay;
		
		public static void welCome() {		
		System.out.println("Welcome to EMP Cal----Please follow the instruction----");
		System.out.println("");
		System.out.println("");
		}
		
		public static void getInput() {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter Employee Name: ");
			nameOfEmployee = scan.nextLine();
			
			System.out.println("Enter Employee Total Hour: ");
			numberOfHourWorked = scan.nextDouble();
			
			System.out.println("Enter Employee Hourly Pay Rate: ");
			hourlyPayRate = scan.nextDouble();	
		}
		
		public static void calculateGrossPay() {
			grossPay = numberOfHourWorked*hourlyPayRate;	
		}
		
		public static void calculateNetPay() {
			if (grossPay>0 && grossPay<=1500) {
				netPay= grossPay-(grossPay*10/100);
			}else if (grossPay>1500 && grossPay<=3000) {
				netPay= grossPay-(grossPay*20/100);
			}else if (grossPay>3000 && grossPay<=4500) {
				netPay= grossPay-(grossPay*30/100);
			}else if (grossPay>4500 && grossPay<=6000) {
				netPay= grossPay-(grossPay*40/100);
			}else if (grossPay>6000) {
				netPay= grossPay-(grossPay*50/100);
			} else {
				netPay=0;
				System.out.println("please input valid digit");
			}
		}
		
		public static void displayOutput() {
			System.out.println("");
			System.out.println("==============================================================");
			System.out.println("Employee Name is: "+nameOfEmployee);
			System.out.println("Employee Total Hour is: "+numberOfHourWorked);
			System.out.println("Employee Hourly Rate is: "+hourlyPayRate);
			System.out.println("Employee Gross is: "+grossPay);	
			System.out.println("Employee Gross is: "+netPay);
		}
		
		public static void exitProgram() {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Thank You for using the claculator.....!!!!");
		}
		
		public static void main(String[] args) {
			welCome();
			getInput();
			calculateGrossPay();
			calculateNetPay();
			displayOutput();
			exitProgram();
}
}
