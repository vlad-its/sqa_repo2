package exercise;

public class BankEx13 {

	//	Exercise 13:
	//		o
	//		Write a Bank class that will have a bank name properties which is shared across all the object. 
	//        Value of these properties is “MyBank”.
	//		o
	//		Bank class will have these properties:
	//		o
	//		  Bank address
	//		  totalEmployees
	//		o
	//		Bank class has these functions:
	//		o
	//		  makeDeposit
	//		  withdrawMoney
	//		o
	//		Branch class extends Bank class,
	//		o
	//		Branch class has these properties : 
	//		  Branch Name 
	//		  Branch address
	//		o
	//		Branch class overrides the withdrawMoney function and provides its own implementation.
	//		o
	//		Write a caller class that creates the object of branch and access all the properties and call
	//		all the methods.

	private static String bankName = "MyBank";

	private String bankAddress;
	private int bankTotalEmplyees;
	public String source = "bank";

	public BankEx13(){  

		//this is a static variable. which will be shared across all the objects
		setBankName("MyBank");

		System.out.println("This is from default BankEx13 constructor"); 
	}

	public BankEx13(String bankName, String bankAddress, int bankTotalEmplyees){       
		BankEx13.bankName =  bankName;
		this.bankAddress = bankAddress;
		this.bankTotalEmplyees = bankTotalEmplyees;

		//this is a static variable. which will be shared across all the objects

		setBankName("MyBank");

		System.out.println("This is from overloaded BankEx13 constructor"); 
	}

	// Make Deposit function
	public Float makeDeposit(Float deposit){
		return deposit;
	}

	//withdrawMoney function
	public Float withdrawMoney(Float withdraw){
		System.out.println("From withdrawMoney function from BankEx13 ");
		return withdraw;
	}
		
	// Set of: Getters and Setters in order to access class properties

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		BankEx13.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public int getBankTotalEmplyees() {
		return bankTotalEmplyees;
	}

	public void setBankTotalEmplyees(int bankTotalEmplyees) {
		this.bankTotalEmplyees = bankTotalEmplyees;
	}

}


