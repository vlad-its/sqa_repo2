package exercise;

//Exercise 10: Write a Calculator class. It provides 4 methods. Add, subtract, multiply and divide. 
//All the methods take two integer parameter and performs the respective operation 
//and returns the result. 
//Write a CalculatorCaller class. 
//Call the add, subtract, multiply and divide methods and print the result values 
//without creating the object of Calculator class.

public class Calculator {
	
	//private String name;
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int substract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	
	public static int modulus(int x, int y) {
		return x % y;
	}

}// end of class Calculator
