package exercise;

//Exercise:
//	
//String:
//1.	Write a class with main method.
//2.	Define String str = new String(“abc”);
//3.	String test = “abc”;
//4.	String test1 = “abc”;
//5.	String test2 = new String(“abc”);
//6.	Compare line2 and line3, 2 and 4, 2 and 5, 3 and 4, 3 and 5, 4 and 5 using “=” operator 
//      and also using “equal” operator.
//

//equel method implemented in object class - java upper class
public class ExStringComparison {
	
	public static void main(String[] args) {
		String str0 = new String("abc"); //my example ).
		String str = new String("abc"); //2.
		String test = "abc";			//3.
		String test1 = "abc";			//4.
		String test2 = new String("abc"); //5.
		
		System.out.println("Comparing references(memory address) of line2 and line3 : "+ (str == test));
        System.out.println("Comparing values of line2 and line3 : "+str.equals(test));
        
        System.out.println("Comparing references of line2 and line4 : "+ (test == test1));
        System.out.println("Comparing values of line2 and line4 : "+test.equals(test1));
        
        System.out.println("Comparing references of line2 and line5 : "+ (test == test2));
        System.out.println("Comparing values of line2 and line5 : "+test.equals(test2));
	
        System.out.println("Comparing references of line3 and line4 : "+ (test == test1));
        System.out.println("Comparing values of line3 and line4 : "+test.equals(test1));
		
        System.out.println("Comparing references of line4 and line5 : "+ (test1 == test2));
        System.out.println("Comparing values of line4 and line5 : "+test1.equals(test2));
        
        //my example comparing two objects with same values and different memory addresses.
        System.out.println("Comparing references of line0 and line2 : "+ (str0 == str));
        System.out.println("Comparing values of line0 and line2 : "+str0.equals(str));
		
	}

}
