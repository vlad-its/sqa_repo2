package class_object;

public class Vehicle {

	//**Exercise 8: Create a vehicle class. 
	//Properties: String color, int make and String model. 
	//Write a default and overloaded constructor that initializes these properties. 
	//Write a main method that creates the object by passing these values. 
	//*Print the values of the properties after the object is created. 


	//Below are the properties/class variable/ instance variable/member variable
	private String color;
	private int make;
	private String model;

	// This is an example of default constructor
	public Vehicle(){    
		System.out.println("This is from default constructor");
	}
	// This is an example of overloaded constructor
	public Vehicle(String color, int make, String model){
		this.color = color;
		this.make = make;
		this.model = model;
		System.out.println("This is from overloaded constructor");
	}

	public static void main(String args[]){    
		//      String str = new String();
		//      str = "abc";
		//String str = new String("abc");

		//calling default constructor Vehicle()
		Vehicle myVechDefaulConstr = new Vehicle();

		//calling the overloaded constructor Vehicle(String color, int make, String model
		Vehicle myVechConstrOverload = new Vehicle("mycolor",12,"honda");   

		Vehicle VehicleObject = new Vehicle();
		VehicleObject.color = "mycolor";
		VehicleObject.make = 12;
		VehicleObject.model = "honda";

		System.out.println("make is : "+VehicleObject.make);
		System.out.println("model is : "+VehicleObject.model);

		String stColor = null;
		int intMake = 0;
		String stModel = null;
		
		Vehicle VehicleObject2 = new Vehicle(stColor, intMake, stModel);
		VehicleObject2.color = "yourcolor";
		VehicleObject2.make = 54;
		VehicleObject2.model = "toyota";
		
		stColor = VehicleObject2.color;
		intMake = VehicleObject2.make;
		stModel = VehicleObject2.model;
		
		
		
		
		
		

		System.out.println("make is : "+VehicleObject2.make);
		System.out.println("model is : "+VehicleObject2.model);

		//calling function printColor()
		VehicleObject2.printColor();

	}

	//This is an example of a function / instance method / behavior of a class
	public void printColor(){
		System.out.println("Function - printColor(), My color is : "+color);
	}  
}
