package basic_learning;

public class HelloWorld1 {
	
	static String classVar = "Entering";
		static String classVar1 = " I am a class variable";
     
    public static void main(String args[]){
    	    	
        System.out.println("Entering main");
        int myVariable = 2/2;
        System.out.println("Value of I is : "+myVariable);
        System.out.println(classVar+" main");
        
        String methodVar = " I am a method variable";
    	System.out.println("methodVar value is: "+methodVar);
        
        int callerValue = childFunction(4);
        System.out.println("Value returned from childFunction(4) to main = "+callerValue);
        
        int callerValue1 = childFunction1(callerValue);
        System.out.println("Exiting main with value from childFunction1(callerValue) = "+callerValue1);
                
    }
     
    public static int childFunction(int myNum){
    	System.out.println(classVar);
    	
        System.out.println("Entering childFunction");
        int myVariable = myNum/2;      
        System.out.println("Returning from childFunction");
        return myVariable;
    }
    
    public static int childFunction1(int myNum1){
        System.out.println("Entering childFunction1");
        int myVariable1 = myNum1*3;      
        System.out.println("Returning from childFunction1");
        return myVariable1;
    }
    
}