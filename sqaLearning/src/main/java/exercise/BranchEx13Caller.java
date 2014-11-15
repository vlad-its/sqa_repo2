package exercise;

public class BranchEx13Caller {

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
	//	******	Write a caller class that creates the object of branch and access all the properties and call all the methods *****.

	public static void main(String args[]){

		BranchEx13 BranchEx13_1 = new BranchEx13("BofA", "123 15 Street, New York, NY", 12500, "Excelsior", "15 Ocean Avenue, SF, CA");//String bankName, String bankAddress, int bankTotalEmplyees
		
		String bankName1 = BankEx13.getBankName();
		String bankAddress1 = BranchEx13_1.getBankAddress();
		int bankTotalEmplyees1 = BranchEx13_1.getBankTotalEmplyees();
		
		String branchName1 = BranchEx13_1.getBranchName();
		String branchAddress1 = BranchEx13_1.getBranchAddress();
		
		
		//System.out.println(" IdNumber is: "+IdNum1);
		System.out.println("Using BankEx13 and BranchEx13 overloaded constructors.");
		System.out.println("The Bank1 Name is: " +bankName1 +"; The Bank1 Address is : "
				+bankAddress1 + "; Bank1 Total Emplyees is : "+bankTotalEmplyees1				
				+ "; The Branch1 Name is: "+branchName1+"; Branch1 Address is: "+branchAddress1+".");
		
		//calling withdrawMoney method from BranchEx13 class
		Float BranchW1 = BranchEx13_1.withdrawMoney(1200.01f);
		System.out.println("Branch withdraw1 "+BranchW1);
        
		//calling withdrawMoney method from BankEx13 class
		BankEx13 Bank1 = new BankEx13();
		Float wmoneyBa = 5000.12f;
        Float BankW1 = Bank1.withdrawMoney(wmoneyBa);
        System.out.println("Bank withdraw1 - "+BankW1);
        
      //calling makeDeposit method from BankEx13 class
        Float makeD = 10000.12f;
        Float BankD1 = Bank1.makeDeposit(makeD);
        System.out.println("Bank deposit1 - "+BankD1);
         
        //Overridden methods are always called from objects not from reference 
        //-- calling @Override
    	//withdrawMoney function from BranchEx13 class
        BankEx13 BranchEx1 = new BranchEx13();
        Float wmoneyBr = 220.13f;
        Float BranchW2 = BranchEx1.withdrawMoney(wmoneyBr);
        System.out.println("Branch withdraw2 - "+BranchW2);
        
        //Overridden properties are always called from reference not objects
        String overridenProper = BranchEx1.source;
        System.out.println(overridenProper);
		
	}
}