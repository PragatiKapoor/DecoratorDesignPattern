package Vehicle;
import Strategy.*;

public class GoodsVehicle extends Vehicle{
	public GoodsVehicle() {
		super(new NormalDriveStrategy());
	}
}
