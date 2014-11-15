package basic_learning;

public class StringsComparison {
	
		 
	    public static void main(String[] args) {
	    	
	    	//Write a java program that has 3 string variables:
        	//1) Soccer
        	//2) Football
        	//3) Cricket
        	//“Soccer” and “Cricket” are a string literal, “Football” is java object.

        	//a) Compare 1 with 2, 1 with 3 and 2 with 3 for equality and memory address.
        	//b) Print out the total characters in 2.
        	//c) Print second last character from 3
        	//d) Print the position of first “c” in 1.
	    	
	        //1., 2., 3.
	        String str1 = "Soccer";
	        String str2 = "Football";
	        String str3 = new String ("Cricket");
	        
	        //a.
	        System.out.println("Comparing references(memory address) of str1 and str2 : "+ (str1 == str2));
	        System.out.println("Comparing values of str1 and str2 : "+str1.equals(str2));
	        
	        System.out.println("Comparing references of str1 and str3 : "+ (str1 == str3));
	        System.out.println("Comparing values of str1 and str3 : "+str1.equals(str3));
	        
	        System.out.println("Comparing references of str2 and str3 : "+ (str2 == str3));
	        System.out.println("Comparing values of str2 and str3 : "+str2.equals(str3));
	        
	             
	 
	      // just an example of length property
	        int length = str2.length();
	        System.out.println("length of str2 is : "+length);
	        
	      //b)
	        String subStr2 = str2.substring(0,8);
	        System.out.println("The total characters of str2 is : "+subStr2);
	        
	                	        
	      //d
	        int indexStr1 = str1.indexOf("c");
	        System.out.println("Index of ' c' in str1 is : "+indexStr1);
	        
	      //c
	        String subStr3 = str3.substring(5,6);
	        System.out.println("Print second last character from str3 is : "+subStr3);
	    }
	 
	
}
