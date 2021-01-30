 package interface_demo;

//if a class is implementing any interface, then it is mandatory to define/override all the methods of interface.  
public class HSBCBank implements USBank, BrazilBank{ //we are achieving multiple inheritance
	//Is-a relationship (relation between class & interface)

	@Override
	public void credit() {
		System.out.println("HSBC---Credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC---Debit");
	}

	@Override
	public void transfer() {
		System.out.println("HSBC---Transfer");
	}
	//own method of HSBC
	public void educationLoan() {
		System.out.println("HSBC---edu loan");
	}
	//own method of HSBC
	public void carLoan() {
		System.out.println("HSBC---car Loan");
	}

	@Override//Brazil Bank Method
	public void mutualFund() {
		System.out.println("HSBC---mutual Fund");
	}
}
