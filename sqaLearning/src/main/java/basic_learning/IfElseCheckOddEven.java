package basic_learning;

public class IfElseCheckOddEven {
	
	public static void main(String args[]){
   	 
    	System.out.println("Entering main1");
    	
    	CheckOddEven(0);
        
        System.out.println("Entering main2");
        
        CheckOddEven(1);
        
        System.out.println("Entering main3");
        
        CheckOddEven(2);
        
    }
	
    public static void CheckOddEven(int intMark){
    	
    	
        System.out.println("Entering CheckOddEven");
        
        if(intMark % 2 == 0){
            //System.out.println("Inside if");  
            System.out.println(intMark+" - is Even Number");
        }else if (intMark % 2 == 1){
            //System.out.println("Inside else if");
            System.out.println(intMark+" - is Odd Number");
        }// else{
            //System.out.println("Inside else");
        	//System.out.println(intMark+" - number is equal to 50");
        //int myVariable = myNum/2; 
        //}
        
       
    }

   
}
