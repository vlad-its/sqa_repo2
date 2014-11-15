package exercise;

public class Ex21StringReverseUseCharArr {

	//	Exercise 21:
	//		1.	Write a java program that reverses the given input string.
	//		2.	For e.g. If I call the function with argument “Prashant”. 
	// 			It should print “tnahsarP”.
	//			Hint : try to use String function to convert to char array and then loop through the array backwards.
	
	// I used the code from the external source in order to implement the Ex21.
		// Source:http://examples.javacodegeeks.com/core-java/lang/string/java-string-reverse-example/
			// 2. Reversing a String using iteration through characters
	
// PS: See class class StringReverseUseCharArr1 for the source code

	private static String str = "Prashant";

	public static void main(String[] args) {   

		//1. Calling the function reverseString(str) by name with parameters in order to get reverse string
		String revstr = reverseString(str);
		//Printing return value from reverseString(String str) 
		System.out.println("Intitial string is"+" '"+str+"'" +", and returned (Reversed) value from reverseString(String str) method is -"
				+" '"+revstr+"'.");

		//2. Another way to get the same result: Calling the function reverseString1(str) by name with parameters in order to get reverse string

		String revstr1 = reverseString1(str);
		//Printing return value from reverseString(String str) 
		System.out.println("Intitial string is"+" '"+str+"'" +", and returned (Reversed) value from reverseString1(String str) method is -"
				+" '"+revstr1+"'.");

	}

	public static String reverseString(String str){

		char[] characters = str.toCharArray(); 
		char[] reverseChars = new char[characters.length];

		for( int i = 0 ; i < characters.length  ; i++){
			reverseChars[i] = characters[(characters.length-1)-i]; 
		}

		String reverse = new String(reverseChars);

		///System.out.println("Normal String is : " + str + " \nReverse String is : "+reverse);
		///System.out.println("***------------------------------------------------***");

		return reverse;

	}

	public static String reverseString1(String str){

		// If you don't want to use double the memory
		// swap the characters in place.

		char[] characters1 = str.toCharArray(); 

		for( int i = 0 ; i < characters1.length/2  ; i++){
			char t = characters1[i];
			characters1[i] = characters1[(characters1.length-1)-i];
			characters1[(characters1.length-1)-i] = t;
		}

		//System.out.println("Normal String is : " + str + " \nReverse String is : "+String.valueOf(characters));

		String reverse1 = new String (String.valueOf(characters1));

		return reverse1;

	}

}
