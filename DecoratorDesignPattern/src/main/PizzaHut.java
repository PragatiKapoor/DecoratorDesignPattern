package main;
import Decorator.*;
import Pizza.*;
public class PizzaHut {

	public static void main(String[] args) {
		BasePizza bp=new FramHouse();
		
		ToppingsDecorator td =new ExtraCheese(bp);
		System.out.println("With cheese "+ td.cost());
		
		ToppingsDecorator td2 = new Mushroom(td);
		System.out.println("With Mushroom "+ td2.cost());
	}

}
