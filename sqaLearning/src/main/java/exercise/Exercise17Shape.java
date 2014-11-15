package exercise;

//Exercise 17:  (Abstract classes)
//•	Write an abstract class Shape. 
//•	Define a String variable “name” and a getter for that variable.
//•	Shape will have 1 overloaded constructor that takes the parameter String name and sets that value to name property.
//•	Shape declares one abstract method double getArea()
//•	Write a circle class.
//•	Circle class should extend Shape class.
//•	Have a property double radius and a getter setter for that.
//•	Have one overloaded constructor that takes 2 arguments, (name and radius).
//•	Name argument should be passed to super class constructor. And radius should be assigned to radius property.
//•	Implement a double getArea() method that does the calculation of 3.14 * r*r and return the value.
//•	Implement the Triangle class similar to circle class, only different there is height and width instead of radius and getArea() will have height and width instead of radius.
//•	Create a shape caller class with a main method in it. Create the object of circle class and triangle class and pass name and radius for circle and name, height and width for triangle while creating object.


public abstract class Exercise17Shape {

	//Define a String variable “name”
	private String name = "initial shape";
	
	public Exercise17Shape() {
		System.out.println("** This is from Exercise17Shape default constractor **");
	}

	//This is an overloaded constructor that takes the parameter String name and sets that value to name property.
	public Exercise17Shape(String name) {
		//This is going to change initial "name" to the parameter name which will be set 
		//when new Exercise17Shape object will be created in following example: 
		// Exercise17Circle c1 = new Exercise17Circle("Red Circle", 2.5);  )
		this.name = name;
		
		System.out.println("** This is from Exercise17Shape overloaded constractor "
				+ "that takes the parameter String name and sets that value to name property.**");
	}

	// Getter for the String variable “name”
	public String getName() {
		return name;
	}

	public abstract double getArea(); 

}

