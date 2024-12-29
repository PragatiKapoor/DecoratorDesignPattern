package AbstractFactory;

public class ShapeFactory extends AbstractFactory {
	
	public Shape getShape(String shape) {
		
		switch(shape ) {
			case "CIRCLE" :
				return new Circle();
			case "RECTANGLE" : 
				return new Rectangle();
			default:
				return null;		
		}
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
