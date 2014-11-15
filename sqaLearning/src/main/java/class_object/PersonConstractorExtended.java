package class_object;

public class PersonConstractorExtended {

	//this is mine extended version of "class PersonConstructorExtended" based on Exercises 8 and 9

	//Below are the properties/class variable/ instance variable/member variable       
	private String name;       
	private int age;
	private String ssn;

	public PersonConstractorExtended(){  
		// Initializing code
		name = "defaultName";
		age = 15;
		ssn = "111-11-1111";

		System.out.println("This is from default constructor");
	}

	public PersonConstractorExtended(String name, int age, String ssn){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public PersonConstractorExtended(String name, int age){
		this(name,age,null);
	}

	//public PersonConstructorExtended(String name){
	//this(name,0,null);     
	//}

	public PersonConstractorExtended(String name3){
		System.out.println("This is from constructor with initialization code ");
		//another initializing code    
		name = name3;
	}

	//This is an example of a function / instance method / behavior of a class
	public void printName(){
		System.out.println("My name is : "+name);
	}  

	public static void main(String args[]){  

		System.out.println("*****Created objects with default constructor *****");

		PersonConstractorExtended objDefConstr = new PersonConstractorExtended();

		System.out.println("Initialized name, age, ssn from defaultConstractor are:"+" ' "+objDefConstr.name+" ',' "+objDefConstr.age+" ', ' "+objDefConstr.ssn+" ' ");

		System.out.println("*****Creating objects with overloaded constructors *****");

		PersonConstractorExtended personObject = new PersonConstractorExtended("myName",23,"123-12-1234"); 
		System.out.println("Age is : "+personObject.age); 
		personObject.printName();
		System.out.println("My ssn is : "+personObject.ssn);          

		PersonConstractorExtended personObject2 = new PersonConstractorExtended("yourName",534); 
		personObject2.printName();
		System.out.println("Age is : "+personObject2.age); 


		String name3 = "initializedName3";
		PersonConstractorExtended personObject3 = new PersonConstractorExtended(name3); 

		personObject3.printName();
		//System.out.println("Age is : "+personObject2.age);
		//System.out.println("My name is : "+personObject3.name);

	}
}
