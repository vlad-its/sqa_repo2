package exercise;

public class Exercise12Employee extends ExercisePerson12 {

	//	Exercise 12:
	//	•
	//	Create a Person Class with gender, age and 	name.
	//	•
	//	Create an Employee Class with IdNum, exprYr.
	//	Define a default and overloaded constructor
	//	for Person class and Employee Class.
	//	•
	//	Employee class constructor should have all 5
	//	properties.(2 of child and 3 of parent)
	//	•
	//	Write an Employee class caller. Create 2
	//	objects one without any arguments and other
	//	with setting all the properties.
	//	•
	//	Print out all the properties for both the
	//	objects. 

	public int IdNum; 
	public int exprYr;

	public Exercise12Employee() {
		this.IdNum = 1000;
		System.out.println("***This is from default Exercise12Employee constractor***");
	}

	public Exercise12Employee(String name, char gender, int age, int IdNum, int exprYr) {
		super(name, gender, age);
		this.exprYr = exprYr;
		this.IdNum = IdNum;

		System.out.println("***This is from overloaded Exercise12Employee constractor***");
	}

	public int getIdNum() {
		return IdNum;
	}

	public void setIdNum(int idNum) {
		IdNum = idNum;
	}

	public int getExprYr() {
		return exprYr;
	}

	public void setExprYr(int exprYr) {
		this.exprYr = exprYr;
	}

}

