package basic_learning;

public class StringExample {
	
	public static void main(String arg[]){
		// String literal uses the same object from String pool
		String str1 = "Test1";// this is using java string literals
		
		// Below creates a new object in memory every time it is used.
		String str2 = new String ("Test2"); // this is java standard way of creating java objects
		String str3 = str1 + str2;
		String str4 = "Test1";
		
		String subStr = str1.substring(2);
		System.out.println("Substring is :"+subStr);
		
		
		System.out.println("Comparing references of str1 and str2 :"+subStr);
		
		// Below. equals compares the value
		System.out.println("Comparing values of str1 and str2 :"+str1.equals(str2));
		
		//Below "==" compares the memory address
		System.out.println("Testing string pool for str2 and str3 : "+ (str1==str3));
		
	    System.out.println("Testing string pool??? for str1 and str4 : "+ str1==str4); // False, since it is no () around __str1 == str4__ 
		
		System.out.println("Testing value equality for str2 and str3 : "+str2.equals(str3));
		
		 //------------------------------------------------------------------------------------
		
		   // Example from Prashant
		        //String literal uses the same object from String pool
		        String str5 = "Test5"; // this is using java string literals
		         
		        //Below creates a new object in memory every time it is used.
		        String str6 = new String ("Test5"); // this is java standard way of objects
		        String str7 = "Test5";
		        String str8 = new String ("Test5"); // this is java standard way of objects    
		        
		      //Below "==" compares the memory address
		        System.out.println("Testing string pool for str5 and str7 : "+ (str5 == str7));
		         
		        //Below "==" compares the memory address
		        System.out.println("Comparing references of str5 and str6 : "+ (str5 == str6));
		 
		        //Below .equals compares the values of string
		        System.out.println("Comparing values of str5 and str6 : "+str5.equals(str6));
		                 
		        System.out.println("Testing value equality for str5 and str7 : "+str5.equals(str7));
		         
		        System.out.println("Testing value equality for str6 and str8 : "+str6.equals(str8));
		        System.out.println("Testing value equality for str6 and str8 : "+str6 == str8);// False, since it is no () around __str1==str4__ 
	}

}
