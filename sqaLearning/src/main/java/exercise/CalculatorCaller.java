package exercise;

public class CalculatorCaller {

	//	Exercise 10: Write a Calculator class. It provides 4 methods. Add, subtract, multiply and divide. 
	//	All the methods take two integer parameter and performs the respective operation 
	//	and returns the result. 
	//  Write a CalculatorCaller class. 
	//	Call the add, subtract, multiply and divide methods and print the result values 
	//	without creating the object of Calculator class.

	public static void main(String args[]){

		//Calculator c1 = new Calculator();
		//Calculator c2 = new Calculator();


		//Directly calling static function from another class without creating the object of Calculator class
		int newadd = Calculator.add(3, 3);
		//and print the result values
		System.out.println("Result from add method from calculator class - "+newadd);

		int newsubstr = Calculator.substract(12, 3);
		System.out.println("Result from add method from calculator class - "+newsubstr);

		int newmultip = Calculator.multiply(12, 3);
		System.out.println("Result from add method from calculator class - "+newmultip);

		int newdiv = Calculator.divide(12, 3);
		System.out.println("Result from add method from calculator class - "+newdiv);

		int newmod = Calculator.modulus(12, 3);
		System.out.println("Result from add method from calculator class - "+newmod);
		




	}

}
