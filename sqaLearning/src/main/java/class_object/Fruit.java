package class_object;

//Exercise 9: Write a fruit class that defines 4 constructors: 
//a)
//default constructor 
//b)
//constructor with 1 argument (String name) 
//c)
//constructor with 2 arguments (String name, String taste) 
//d)
//constructor with 3 arguments (String name, String taste, String color); 

//Only one of the constructor should have the initialization code and rest of the constructors should use “this(...)” syntax. 
//From the main method, create 4 objects one for each constructor type and print the properties after each object is created. 

public class Fruit {

	private String name;
	private String color;
	private String taste;

	public Fruit(){
		// Initializing code
		//name = "Orange";
		//color = "Orange color";
		//taste = "Sweet";

		System.out.println("   This is from default constructor");
		System.out.println();
	}

	public Fruit(String name){

		this(name, null, null);

		System.out.println("   This is from Fruit(String name) constructor");

	}

	public Fruit(String name, String taste){  
		this(name, taste, null);

		System.out.println("   This is from Fruit(String name, String color) constructor");

	}

	public Fruit( String name, String taste, String color){  
		// Initialization code - this is main constructor, where initialization happens.		
//		this.name = name;
//		this.taste = taste;
//		this.color = color;

		System.out.println("   This is from Fruit(String name, String color, String taste) constructor");

	}

	public void printFuitName(){
		System.out.println("Fruit name is : "+name);
	}  

	public static void main(String args[]){
		//1. *****Creating objects with default constructor ***** Fruit()

		System.out.println("*****Creating objects with default constructor *****");

		Fruit objDefConstr = new Fruit();
		// Printing the properties after object is created
		//System.out.println("1. Initialized name, taste, color from defaultConstractor are: "+"'"
				//+objDefConstr.name+"','"+objDefConstr.taste+"', '"+objDefConstr.color+"'. ");

		//2. Creating objects with Fruit(String name) constructor

		Fruit fruitObject2 = new Fruit("Apple"); 
		// Printing the properties after object is created
		System.out.println("2. The name is : "+fruitObject2.name 
				+".");

		//3. Creating objects with Fruit(String name, String color) constructor

		Fruit fruitObject3 = new Fruit("Apple","Sour"); 
		// Printing the properties after object is created
		System.out.println("3. The name is : "+fruitObject3.name+", the taste is : " 
				+fruitObject3.taste+".");

		//4. Creating objects with Fruit(String name, String color, String taste) constructor

		Fruit fruitObject4 = new Fruit("Apple","Sour","Red"); 
		// Printing the properties after object is created
		System.out.println("4. The Fruit name is : "+fruitObject4.name+", the taste is : " 
				+fruitObject4.taste+", and the color is : "+fruitObject4.color+".");
		// Print fruit name
		fruitObject4.printFuitName();

	}// end main()
}// class Fruit
