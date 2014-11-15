package exercise;

//Exercise 19: 
//1.	Write a class Country
//2.	Properties String countryCode, String countryName, long population, String currency.
//3.	Define overloaded constructor that takes all these arguments as parameter and sets all the properties.
//4.	Write a CountryCaller and a main method.
//5.	Create two-two country objects for each of the below country: Canada, America, Italy, Spain, England. 
//    Use 3 letters code for these countries and set other properties while creating objects.
//6.	Compare the same country objects with each other and print out the results.
//7.	Implement the equals and hashcode using countryCode as criteria.
//8.	Repeat step 6.

public class Exercise19CountryHW {
	
	String countryCode; 
	String countryName; 
	long population; 
	String currency;
	
	public Exercise19CountryHW(String countryCode, String countryName, long population, String currency) {
		
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.population = population;
		this.currency = currency;

		System.out.println("***This is from overloaded Exercise19Country constractor***");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercise19CountryHW other = (Exercise19CountryHW) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		return true;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
