package basic_learning;


//Write a function which takes a int parameter and print the message on screen that “number is greater 
// than 10” otherwise it should print “number is smaller then 10”

public class IfStatementIntParam {

	  
    public static void main(String args[]){
    	 
    	System.out.println("Entering main1");
    	
        childFunction(5);
        
        System.out.println("Entering main2");
        
        childFunction(11);
        
        System.out.println("Entering main3");
        
        childFunction(10);
        
    }
	
    public static void childFunction(int myNum){
    	
    	
        System.out.println("Entering childFunction");
        
        if(myNum > 10){
            //System.out.println("Inside if");  
            System.out.println(myNum+" - number is greater than 10");
        }else if (myNum < 10){
            //System.out.println("Inside else if");
            System.out.println(myNum+" - number is smaller than 10");
        }else{
            //System.out.println("Inside else");
        	System.out.println(myNum+" - number is equal to 10");
        //int myVariable = myNum/2; 
        }
            
       
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
