package exercise;

public class BankAccount {
	
	//Exercise 11
//	Write a BankAccount class. It should have actHolderName, accountNumber, initialAmount properties.
//	accountNumber should get  incremented and assigned automatically to the object everytime 
//	when a BankAccount object is created. Create BankAccountCaller class. Create 5 BankAccount objects 
//	and print accountNumber for every object.

	
	private String actHolderName;
	public static int accountNumber;
	private float initialAmount;
	
	//public BankAccount(){
		
	//}
	
	public BankAccount(String actHolderName, float initialAmount){
		this.actHolderName = actHolderName;
		this.initialAmount=initialAmount;
        
		accountNumber++;
    }

	public String getActHolderName() {
		return actHolderName;
	}

	public void setActHolderName(String actHolderName) {
		this.actHolderName = actHolderName;
	}

	public static int getAccountNumber() {
		return accountNumber;
	}

	public static void setAccountNumber(int acNum) {
		BankAccount.accountNumber = acNum;
	}

	public float getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(float initialAmount) {
		this.initialAmount = initialAmount;
	}

}
