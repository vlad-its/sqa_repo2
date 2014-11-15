package exercise;

//Test Exercises:
//Static/Non Static
//a)
//1.	Write a class that has static printName() method
//2.	Define non static method getName() in the same class
//3.	Call getName inside the printName() method.
//
//b)
//1.	in the same class that has non static method printAddress();
//2.	Define a static method getAddress(); in the class.
//3.	Call getAddress() from printAddress() method.


public class ExStaticNoneStatic {

	private String name;
	private String address;

	public static void printName() {
		//have to create the object first when calling none-static method from the static method.
		ExStaticNoneStatic  Exsns = new ExStaticNoneStatic(); 

		Exsns.getname();
		//	getname();// - this call gave me an error
	}

	public String getname() {
		return name;

	}

	public void printAddress() {

		getaddress();

	}

	public String getaddress() {
		return address;

	}

}
