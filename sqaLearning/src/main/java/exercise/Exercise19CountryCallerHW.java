package exercise;

		//Exercise 19.
		//4.	Write a CountryCaller and a main method.
		//5.	Create two-two country objects for each of the below country: 
		//      Canada, United States of America, Italy, Spain, England. Use 3 letters code for these countries and set other properties while creating objects
		//6.	Compare the same country objects with each other and print out the results.
		//7.	Implement the equals and hashcode using countryCode as criteria.
		//8.	Repeat step 6.

// "==" compares for the memory reference. so it should be false, because they are 2 different object in memory.
// ".equals" goes in the implementation that you have provided in your class. which is to compare values, 
// which is same in this case, so it should be true.

public class Exercise19CountryCallerHW {

	public static void main(String args[]){
		
		// in order to get the correct result - have to compare objects like (ca1) not properties like (can1.countryCode)
		// use () in statement like (can2.equals(can2) or (can1 == can2), if will not use () like can2.equals(can2) or can1 == can2,
		// will get incorrect results (True instead False and v.s.)

		//a. CANADA
		Exercise19CountryHW can1  = new Exercise19CountryHW ("+2", "CAN", 35000000, "Canadian dollar");
		Exercise19CountryHW can2  = new Exercise19CountryHW ("+2", "CAN", 35000000, "Canadian dollar");

		//Comparing values and reference memory of can1 and can2 
		System.out.println("Comparing references(memory address) of can1 and can2 - (can1 == can2) :"
				+(can1 == can2));
		System.out.println("Comparing values of can1 and can2 - "
				+ "(can1.equals(can2) :"+(can2.equals(can2)));

		//b. USA
		Exercise19CountryHW usa1  = new Exercise19CountryHW ("+1", "USA", 317000000, "United States dollar");
		Exercise19CountryHW usa2  = new Exercise19CountryHW ("+1", "USA", 317000000, "United States dollar");

		//Comparing values and reference memories of usa1 and usa2 
		System.out.println("Comparing references(memory address) of usa1 and usa2 - (usa1 == usa2) :"
				+(usa1 == usa2));
		System.out.println("Comparing values of usa1 and usa2 - "
				+ "(usa1.equals(usa2) :"+(usa2.equals(usa2)));

		//c. ITA
		Exercise19CountryHW ita1  = new Exercise19CountryHW ("+39", "ITA", 59400000, "Euro");
		Exercise19CountryHW ita2  = new Exercise19CountryHW ("+39", "ITA", 59400000, "Euro");

		//Comparing values and reference memories of ita1 and ita2 
		System.out.println("Comparing references(memory address) of ita1 and ita2 - (ita1 == ita2) :"
				+(ita1 == ita2));
		System.out.println("Comparing values of ita1 and ita2 - "
				+ "(ita1.equals(ita2) :"+(ita2.equals(ita2)));

		//d. ESP
		Exercise19CountryHW esp1  = new Exercise19CountryHW ("+34", "ESP", 46507760, "Euro");
		Exercise19CountryHW esp2  = new Exercise19CountryHW ("+34", "ESP", 46507760, "Euro");

		//Comparing values and reference memories of esp1 and esp2
		System.out.println("Comparing references(memory address) of esp1 and esp2 - (esp1 == esp2) :"
				+(esp1 == esp2));
		System.out.println("Comparing values of esp1 and esp2 - "
				+ "(esp1.equals(esp2) :"+(esp2.equals(esp2)));

		//e. ENG
		Exercise19CountryHW eng1  = new Exercise19CountryHW ("+44", "ENG", 5350000, "Pound Sterling");
		Exercise19CountryHW eng2  = new Exercise19CountryHW ("+44", "ENG", 5350000, "Pound Sterling");

		//Comparing values and reference memories of eng1 and eng2 
		System.out.println("Comparing references(memory address) of eng1 and eng2 - (eng1 == eng2) :"
				+(eng1 == eng2));
		System.out.println("Comparing values of eng1 and eng2 - "
				+ "(eng1.equals(eng2) :"+(eng2.equals(eng2)));

		// ============================================
		//		https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html
		//
		//**		The equals() Method
		//
		//		The equals() method compares two objects for equality and returns true if they are equal. The equals() method provided in the Object class uses the identity operator (==) to determine whether two objects are equal. For primitive data types, this gives the correct result. For objects, however, it does not. The equals() method provided by Object tests whether the object references are equal—that is, if the objects compared are the exact same object.
		//
		//		To test whether two objects are equal in the sense of equivalency (containing the same information), you must override the equals() method. Here is an example of a Book class that overrides equals():
		//
		//			public class Book {
		//			...
		//			public boolean equals(Object obj) {
		//				if (obj instanceof Book)
		//					return ISBN.equals((Book)obj.getISBN()); 
		//				else
		//					return false;
		//		===============================================

		//				Consider this code that tests two instances of the Book class for equality:
		//
		//		// 		Swing Tutorial, 2nd edition
		//
		//		Book firstBook  = new Book("0201914670");
		//		Book secondBook = new Book("0201914670");
		//		if (firstBook.equals(secondBook)) {
		//		    System.out.println("objects are equal");
		//		} else {
		//		    System.out.println("objects are not equal");
		//		}
		//
		//		This program displays objects are equal even though firstBook and secondBook reference two distinct objects. 
		//		They are considered equal because the objects compared contain the same ISBN number.
		//
		//		You should always override the equals() method if the identity operator is not appropriate for your class.

		System.out.println("***=================================***");

		if (usa1.equals(usa2)) {
			System.out.println("usa1 and usa2 objects are equal");
		} else {
			System.out.println("usa1 and usa2 objects are not equal");

		}


	}

}
