package AbstractFactory;

public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		
		switch(color ) {
		case "BLUE" :
			return new Blue();
		case "GREEN" : 
			return new Green();
		default:
			return null;
		}

	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
