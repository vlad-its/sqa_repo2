package basic_learning;

public class EvenNumber100 {
	//Write a java program which prints all even number from 1 to 100
	//–
	//Use Java loops
	//–
	//Use % operator to check if a number is even or not.
	public static void main(String[] args) { 
		
		for(int i=1; i<=100; i++){
			
			if (i % 2 == 0)
				
			System.out.println("Value of i is : "+i+", and it is even");
			
			
		}
	}
}
