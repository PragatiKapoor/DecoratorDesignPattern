package Decorator;

import Pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator {
	
	BasePizza bp;
	public ExtraCheese(BasePizza pizza){
		this.bp=pizza;
	}
	@Override
	public int cost() {		
		return this.bp.cost()+ 10;
	}

}
