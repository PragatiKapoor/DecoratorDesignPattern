package AbstractFactory;

public class MainClass {

	public static void main(String[] args) {
		FactoryProducer fp=new FactoryProducer();
		AbstractFactory af=fp.getFactory("COLOR");
		Color c=af.getColor("BLUE");
		c.fill();
		
		AbstractFactory af2=fp.getFactory("SHAPE");
		Shape s=af2.getShape("CIRCLE");
		s.draw();
	}

}
