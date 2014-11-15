package basic_learning;

public class ForLoopSum {
    
      
	public static void main(String[] args) {      
		
		// Exercise 4: Sum (Loop): Write a program called Sum to produce the sum of 1, 2, 3, ..., to an upperbound limit of 2000;
        
        //int[] intArr = new int[]{1,2,3,4,5,6,7,8,9,10};
       // String[] nameArr = new String[]{"india","usa","russia","japan"};
        //Integer k = 0;
        //int myInt =0;
         
		
    	  Sum(0);
    	 
          //System.out.println("Value of i is : "+i);
      }
      public static void Sum(int i) {
    	  
    	  int intSum = 0;
//        System.out.println("Incrementing for loop **************");
          for( i=1; i<=2000; i++){
    	  
        	  intSum = intSum + i;
    	  
        	  if(i >=2000){
  	            System.out.println("Inside if");  
  	            System.out.println(intSum+" - this is a sum of 1,2,3...upperbound limit of 2000");
  	        }
        	  else if (intSum < 2000){
        	  }
//     
//      System.out.println("Decrementing for loop **************");
//      for(int j=10; j>0; j--){
//          System.out.println("Value of j is : "+j);
//      }
         
        //System.out.println("for each loop **************");
        //for(int arrValue : intArr){
        //    System.out.println("Value of array element is : "+arrValue);
        //}
         
        //String[] nameArr = new String[]{"india","usa","russia","japan"};
        //for(String countryName : nameArr){
        //    System.out.println("Name of the country is : "+countryName);           
        //}
    
      	
         }
      
	   }
    }
