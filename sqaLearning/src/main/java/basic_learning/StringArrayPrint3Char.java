package basic_learning;

public class StringArrayPrint3Char {

	public static void main(String[] args) {

		//Exercise 6: Define a function that accepts a String array and print only first 3 characters of every string value. 
		//Call this function from the main method and pass a String array that has name of any 5 countries.


		/// ********************************
		String[] ctryNameArr = new String[]{" India","US","Russia","  Japan", " France", " I", "C" };
		printCountryName(ctryNameArr);

		//for(String countryName : nameArr){
		//System.out.println("Name of the country is : "+countryName);

		//String[] prString = print3Char(nameArr);
		//System.out.println(prString);

	}

	///Exercise 7 : In exc.6, with validation for only do substring if string length is greater than 3 and change the case of all the countries to lower. (hint : String.toLowerCase())
	public static void printCountryName(String[] ctryNames){

		//System.out.println("Inside if"); 
		for(String ctryName : ctryNames){
			// add the validation to only do substring if string length is greater when 3
			if(ctryName.length() > 3){

				/// trim and put the ContryNames to lowcase
				System.out.println(ctryName.substring(0,3).trim().toLowerCase());
			}else if (ctryName.length() < 3){
			System.out.println("Inside else if,"+" do nothing since for country name - "+" '"+ctryName+"'"+", (contryname.length() < 3), just printing this text!");
			
			}
			//for(int i=0; i<ctryNames.length; i++){
			//	String ctryName2 = ctryNames[i];
			//	System.out.println(ctryName2.substring(0,3));
			//}

		}		



		//System.out.println("The length of array is: " + stringArr.length);
		//for (int i=0; i<=stringArr.length-1; i++)
		//System.out.println("The array element index "+ i+" is: " + stringArr[i]);

		//return stringArr;
	}


}
