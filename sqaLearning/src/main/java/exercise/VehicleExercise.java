package exercise;

public class VehicleExercise {
	
//	Create a class Vehicle
//	Define attributes of the Vehicle class (color, model, make)
//	Define methods in a Class (getter and setter)
//	Create an object of a class in separate class (VehicleCaller)
//	Set the object properties by calling object setter
//	Invoke the main method and print properties using getter.
	
	private String color;
    private String make;
    private String model;
    
    public VehicleExercise(){
        //this is redundant step
        this(null,null,null);
        System.out.println("just calling the main constructor from no args const.");
    }
    
    public VehicleExercise(String color, String make, String model){
        //this is redundant step
    	this.color = color;
        this.make = make;
        this.color = model;
        System.out.println("in main main constructor");
    }
    
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	} 
}
