package basic_learning;

public class StringOperations {
	
	public static void main(String[] args) {
		
		String str1 = "Java classes are funny";
		String str2 = "are they really?";
		
		int length = str1.length();
		System.out.println("length of the str1 is :"+length);
		
		String subStr1 = str1.substring(1,length);
		System.out.println("Substring of the str1 is :"+subStr1);
		
		int indexStr2 = str2.indexOf("b");
		System.out.println("Index of ' are' in str2 is :"+indexStr2);
	}
	

}
