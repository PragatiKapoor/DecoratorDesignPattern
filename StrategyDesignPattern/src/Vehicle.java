import Strategy.DriveStrategy;

public class Vehicle {
	
	DriveStrategy driveObject;
	
	//this is known as constructor injection
	Vehicle(DriveStrategy obj){
		this.driveObject=obj;
	}
	
	public void drive() {
		driveObject.drive();
	}
}
