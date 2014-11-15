package exercise;

public class StringReverseRecursion1 {

	//This is how you can use recursion to compute the reverse of String:

	public static void main(String[] args) {

		String str = "Java";
		String reverseStr = reverseRecurive(str);
		System.out.println("Normal String is : " + str + " \nReverse String is : "+reverseStr);    
	}

	public static String reverseRecurive(String str) {

		if (str.length() <= 1) {
			return str;
		}

		return reverseRecurive(str.substring(1)) + str.charAt(0);
		
		// Source: http://examples.javacodegeeks.com/core-java/lang/string/java-string-reverse-example/

		//		This will output:
		//
		//			Normal String is : Java
		//			Reverse String is : avaJ
		//
		//			At first sight, the above recursive algorithm, might not be straight forward. Let’s see how this works. 
		//          We can model the recursive calls like this
		//
		//			    1st call – reverseRecurive("Java") : will return reverseRecurive("ava") + "J"
		//			    2nd call – reverseRecurive("ava") : will return reverseRecurive("va") + "a"
		//			    3rd call – reverseRecurive("va") : will return reverseRecurive("a") + "v"
		//			    4th call – reverseRecurive("a") : will return "a"
		//			    3rd call – will return : reverseRecurive("a")  + “v” =  “a” + “v”
		//			    2nd call – will return : reverseRecurive("va") + “a” = “a” + “v” + “a”
		//			    1st call – will return  : reverseRecurive("ava") + “J” = “a” + “v” + “a” + “J”
		//
		//			That should make it a bit more clear.
		//          As you can see, in this example the depth of the recursion is equal to the length of the String. 
		//          If the String is very long and stack size is of major concern...

	}
}
