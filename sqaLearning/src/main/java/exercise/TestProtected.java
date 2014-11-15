package exercise;

import inheritence.Vehicle;

public class TestProtected extends Vehicle {

	public void testProtected(){
		super.source = "ac";

		new TestProtected().source = "ac";              

	}

	// public static void main(String args[]){

	//String TP1 = new TestProtected().source = "ac";

	//System.out.println("TestProtected().source = "+TP1);

	//}
}
