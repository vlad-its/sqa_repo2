package exercise;


public class Exercise17ShapeCaller {

	public static void main(String args[]){

		Exercise17Circle c1 = new Exercise17Circle("Red Circle", 2.5);
		
		String cName1 = c1.getName(); 		
		System.out.println("c1 circle name - "+cName1);
		
		Double cArea1 = c1.getArea();
		System.out.println("Circle c1 area - "+cArea1);

		System.out.println("***---------------------------------------------------------------------------------***");
				

		Exercise17Shape tr1 = new Exercise17Triangle("Blue Triangle", 2.1, 3.5);
		
		String trName1 = tr1.getName();
		System.out.println("tr1 triangle name - "+trName1);

		Double trArea1 = tr1.getArea();

		System.out.println("Triangle tr1 area - "+trArea1);

	}

}
