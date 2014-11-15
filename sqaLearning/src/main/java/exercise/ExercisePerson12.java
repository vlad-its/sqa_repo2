package exercise;

public class ExercisePerson12 {
	
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

	public String name;
	public char gender;
	public int age;
	
	public ExercisePerson12() {
		
		System.out.println("***This is from default super constractor***");
		
	}

	public ExercisePerson12(String name, char gender, int age){       
		this.name = name;
		this.gender = gender;
		this.age = age;
		System.out.println("***This is from overloaded super constractor***");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
