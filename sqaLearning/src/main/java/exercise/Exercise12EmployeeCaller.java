package exercise;

public class Exercise12EmployeeCaller {

	//	Exercise 12:
	//		•
	//		Create a Person Class with gender, age and 	name.
	//		•
	//		Create an Employee Class with IdNum, exprYr.
	//		Define a default and overloaded constructor
	//		for Person class and Employee Class.
	//		•
	//		Employee class constructor should have all 5
	//		properties.(2 of child and 3 of parent)
	//		•
	//		Write an Employee class caller. Create 2
	//		objects one without any arguments and other
	//		with setting all the properties.
	//		•
	//		Print out all the properties for both the
	//		objects. 

	public static void main(String args[]){
		//Car myCar1 = new Car();
		Exercise12Employee myEmp1 = new Exercise12Employee();
		String name1 = myEmp1.getName();
		char gender1 = myEmp1.getGender();
		int age1 = myEmp1.getAge();
		int IdNum1 = myEmp1.getIdNum();
		int exprYr1 = myEmp1.getExprYr();
		//System.out.println(" IdNumber is: "+IdNum1);
		System.out.println("Using default constructor. The name is: "+name1+", gender is: "+gender1+", age is: "+age1+", IdNumber is: "+IdNum1+", Years of Expr are: "+exprYr1);

		Exercise12Employee myEmp2 = new Exercise12Employee("Iv Pet",'M',30,1234,5); //String name, char gender, int age, int IdNum, int exprYr
		String name2 = myEmp2.getName();
		char gender2 = myEmp2.getGender();
		int age2 = myEmp2.getAge();
		int IdNum2 = myEmp2.getIdNum();
		int exprYr2 = myEmp2.getExprYr();

		System.out.println("Using overloaded constractor: The name is: "+name2+", gender is: "+gender2+", age is: "+age2+", IdNumber is: "+IdNum2+", Years of Expr are: "+exprYr2);

	}

}
