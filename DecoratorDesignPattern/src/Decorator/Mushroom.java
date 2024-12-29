package Decorator;

import Pizza.BasePizza;

public class Mushroom extends ToppingsDecorator {

	BasePizza bp;
	public Mushroom(BasePizza pizza){
		this.bp=pizza;
	}
	@Override
	public int cost() {
		return this.bp.cost()+50;
	}

}
