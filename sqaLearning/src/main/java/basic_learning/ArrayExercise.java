package basic_learning;
 
public class ArrayExercise {
 
    public static void main(String[] args) {       
        //1. Declare an array of char which takes 5 element
        char[] charArr = new char [5];
        //We start populating individual array elements with values
        charArr[0] = 'a';
        charArr[1] = 'b';
        charArr[2] = 'c';
        charArr[3] = 'd';
        charArr[4] = 'e';
        
      //2. We define and instantiate the int array object with size 3
        int[] intArr = new int[3];
        //We start populating individual array elements with values
        intArr[0] = 32;
        intArr[1] = 54;
        intArr[2] = 23;
        
       // Declare an array of int and initialize element in the array
         
        //We read the individual array elements
        int secondIndex = intArr[1];
        System.out.println("Value at 1st index is : "+intArr[0]);
        System.out.println("Value at 2nd index is : "+secondIndex);
         
        //We loop through the length of array and read every element        
        for(int i=0; i<intArr.length; i++){
            System.out.println("Value at "+i+" index is : "+intArr[i]);
        }
         
        //another way to define, instantiate and initialize the array
        int[] anotherIntArr = new int[]{90,23,76};
         
        //populate the array using for loop
        for(int i=0; i<anotherIntArr.length; i++){
            anotherIntArr[i] = i+1;
            
       //Write a method (function) which takes a parameter of array of int and print the size of any array.     
            printSize(anotherIntArr);
            
            String[] stringArr = {"first", "second", "third", "fourth", "fifth", "sixth"};
            
            printArrLength_Element(stringArr);
        }
    }
    
        public static void printSize(int inputArr[]){
        	System.out.println("Exc.3 - Size of the array is : "+inputArr.length);
        }
        
        
        public static void printArrLength_Element(String[] stringArr){
        	  System.out.println("The length of array is: " + stringArr.length);
        	  for (int i=0; i<=stringArr.length-1; i++)
        	   System.out.println("The array element index "+ i+" is: " + stringArr[i]);
        	 }
    }

