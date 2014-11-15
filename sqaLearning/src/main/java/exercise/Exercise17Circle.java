package exercise;

public class Exercise17Circle extends Exercise17Shape {
	
	private double radius; 

	public Exercise17Circle(String name, double radius ) {
		super(name);
		this.radius = radius;
		System.out.println("** This is from Exercise17Circle overloaded constractor **");

	}

	@Override
	public double getArea() {
		//double r = radius;
		//double area;
		//area = 3.14 *r *r;

		return 3.14 * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
