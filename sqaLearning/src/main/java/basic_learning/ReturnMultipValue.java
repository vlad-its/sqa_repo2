package basic_learning;

public class ReturnMultipValue {

	public static void main(String[] args) {      

		// Exercise 5: Define a function that accepts two int variables and returns the multiplication value of that. 
		//Call this function from the main method and print the return value.


		// Calling the function by name with parameters
		int myVal = Multiplic(3,4);
		
		//Printing return value from Multiplic(int i, int j) 
		System.out.println("returned value from Multiplic function is - "+myVal);


	}
	public static int Multiplic(int i, int j) {

		int intMultip = 0;
		//            	  
		intMultip = i * j;

		//System.out.println(intMultip+" - the return value of multiplication of "+i +" and " +j);

		return intMultip;

	}

}



