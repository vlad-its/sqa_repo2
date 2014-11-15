package exercise;

public class Exercise17Triangle extends Exercise17Shape {
	
	private double height; 
	private double width;

	public Exercise17Triangle(String name, double height, double width ) {
		super(name);
		this.height = height;
		this.width = width;
		System.out.println("** This is from Exercise17Triangle overloaded constractor **");
		
	}

	@Override
	public double getArea() {
		return (getHeight() * getWidth())/2;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
