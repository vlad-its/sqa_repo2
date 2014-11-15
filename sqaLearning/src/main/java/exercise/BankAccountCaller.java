package exercise;

public class BankAccountCaller {
	
	//Exercise 11
//	Write a BankAccount class. It should have actHolderName, accountNumber, initialAmount properties.
//	accountNumber should get  incremented and assigned automatically to the object everytime 
//	when a BankAccount object is created. Create BankAccountCaller class. Create 5 BankAccount objects 
//	and print accountNumber for every object.
	
	public static void main(String args[]){
		
		
		BankAccount ba1 = new BankAccount(null, 0);
        ba1.setActHolderName("Ivan Pet");
        ba1.setInitialAmount(100000.29f);
        
      //Calling the static variable
        System.out.println(BankAccount.accountNumber);// do not use this - calling property directly 
       
        System.out.println(BankAccount.getAccountNumber());
 
        //Calling the static method.
        System.out.println(ba1.getAccountNumber());   
        
        BankAccount ba2 = new BankAccount(null, 0);
        ba2.setActHolderName("Pet2 Pet3");
        ba2.setInitialAmount(300000.29f);
        
      //Calling the static variable
        System.out.println(BankAccount.accountNumber);
        System.out.println(BankAccount.getAccountNumber());
 
        //Calling the static method.
        System.out.println(ba2.getAccountNumber());  
		
	}

}
