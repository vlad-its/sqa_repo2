package exercise;

public class StringReverseUseCharArr1 {

	public static void main(String[] args) {

		// Source:http://examples.javacodegeeks.com/core-java/lang/string/java-string-reverse-example/
		// 2. Reversing a String using iteration through characters

		//In this case we are first going to obtain a character array from the String in order to handle its characters individually. 
		//Then, we can either choose to create another array of the same length and simply copy the last character of the first array ..
		//to first character of the second, then the second to last character of the first array to the second character of the second e.t.c. 
		//Another way would be to swap the characters in place in the same array.

		//String str1 = "This was a String to reverse"; // it was initial string value from the source.
		String str = "Prashant";

		char[] characters = str.toCharArray(); 
		char[] reverseChars = new char[characters.length];

		for( int i = 0 ; i < characters.length  ; i++){
			reverseChars[i] = characters[(characters.length-1)-i]; 
		}

		String reverse = new String(reverseChars);
		System.out.println("Normal String is : " + str + " \nReverse String is : "+reverse);
		
		System.out.println("***------------------------------------------------***");

		// If you don't want to use double the memory
		// swap the characters in place
		for( int i = 0 ; i < characters.length/2  ; i++){
			char t = characters[i];
			characters[i] = characters[(characters.length-1)-i];
			characters[(characters.length-1)-i] = t;
		}

		System.out.println("Normal String is : " + str + " \nReverse String is : "+String.valueOf(characters));
	}

}
