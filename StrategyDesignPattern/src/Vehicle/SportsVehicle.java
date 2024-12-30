package Vehicle;
import Strategy.*;

public class SportsVehicle extends Vehicle{
	public SportsVehicle() {
		super(new SportsDriveStrategy());
	}
}
