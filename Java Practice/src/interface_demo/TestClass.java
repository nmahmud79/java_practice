package interface_demo;

public class TestClass {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal = 200; //not possible because variables of interface is static and final, which is not allowed to change. 
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfer();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund(); 
		
		System.out.println("**************************");
		//dynamic polymhorphism
		//child class object can be referred by parent Interface reference variables
		USBank uBank = new HSBCBank();
		uBank.credit();
		uBank.debit();
		uBank.transfer();
		
		
		

	}

}
