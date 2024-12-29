package Observable;

import java.util.*;
import Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable{
	
	List<NotificationAlertObserver> observerlist = new ArrayList<>();
	public int stockCount=0;
	@Override
	public void add(NotificationAlertObserver observer) {
		observerlist.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerlist.remove(observer);		
	}

	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver observer : observerlist) {
			observer.update();
		}
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount == 0 ) {
			notifySubscribers();
		}
		stockCount=stockCount + newStockAdded;	
		System.out.println("New stock added , total stock = "+stockCount);
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}
	

}
