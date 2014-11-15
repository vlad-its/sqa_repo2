package exercise;

//Exercise 13:
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

public class BranchEx13 extends BankEx13 {

	public String branchName;
	public String branchAddress;
	public String source = "branch";

	public BranchEx13(){  

		System.out.println("This is from default BranchEx13 constructor"); 
	}

	public BranchEx13(String bankName, String bankAddress, int bankTotalEmplyees, String branchName, String branchAddress){       
		super(getBankName(), bankAddress, bankTotalEmplyees);
		this.setBranchName(branchName);
		this.setBranchAddress(branchAddress);

		System.out.println("This is from overloaded BranchEx13 constructor"); 
	}

	@Override
	//withdrawMoney function
	public Float withdrawMoney(Float withdraw){
		System.out.println("- WithdrawMoney function from BankEx13 class. ***'Overrided'*** with the withdrawMoney function from BranchEx13 - "+withdraw);
		return withdraw;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

}
