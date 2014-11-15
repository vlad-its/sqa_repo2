package exercise;


public class StringReverseTest1 {
	
	//Source http://stackoverflow.com/questions/19462439/reverse-each-word-of-user-given-string-without-altering-their-position 
	// code #2
	
	private static String str = "Prashant";
	String revstr = reverseWordByWord(str);
	
	public static void main(String[] args) {      

		// Call reverseWordByWord(String str) method from the main method and print the return value.

		// Calling the function by name with parameters
		String revstr = reverseWordByWord(str);
		
		//Printing return value from reverseWordByWord(String str) 
		System.out.println("Intitial string is"+" '"+str+"'" +", and returned (Reversed) value from reverseWordByWord(String str) method is -"
				+" '"+revstr+"'.");

	}
	
	public static String reverseWordByWord(String str){
        int strLeng = str.length()-1;
        String reverse = "", temp = "";

        for(int i = 0; i <= strLeng; i++){
            temp += str.charAt(i);
            if((str.charAt(i) == ' ') || (i == strLeng)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strLeng))
                        reverse += " ";
                }
                temp = "";
            }
        }
        return reverse;
    }
	
}

