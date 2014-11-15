package basic_learning;


// Exercise 2: CheckPassFail (if-else): Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.

public class IfEsleCheckConditions {
		
		  
	    public static void main(String args[]){
	    	 
	    	System.out.println("Entering main1");
	    	
	    	CheckPassFail(50);
	        
	        System.out.println("Entering main2");
	        
	        CheckPassFail(11);
	        
	        System.out.println("Entering main3");
	        
	        CheckPassFail(1);
	        
	    }
		
	    public static void CheckPassFail(int intMark){
	    	
	    	
	        System.out.println("Entering CheckPassFail");
	        
	        if(intMark >= 50){
	            //System.out.println("Inside if");  
	            System.out.println(intMark+" - number is greater or equal to 50"+" - PASS");
	        }else if (intMark < 50){
	            //System.out.println("Inside else if");
	            System.out.println(intMark+" - number is smaller than 50"+ " - FAIL");
	        }// else{
	            //System.out.println("Inside else");
	        	//System.out.println(intMark+" - number is equal to 50");
	        //int myVariable = myNum/2; 
	        //}
	            
	       
	    }
	    
	    //By Reno
	    // //method outside of main 
	    //public static void if_Method(int n){
	    	  // if (n > 10) {
	    	  //    System.out.println(" Number " + n +" is greater than 10");
	    	  // }else if( n <10){
	    	  //    System.out.println(" Number " + n +" is less than 10");
	    	  // }else{
	    	  //    System.out.println(" Number " + n +" is equal to 10");
	    	 //    }
	    	 //   }
	    	//                     //in main call the method
	    	//   if_Method(5);
	        //   if_Method(11);
	    	//   if_Method(10);
	    
	}


