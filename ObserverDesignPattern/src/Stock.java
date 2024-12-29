import Observable.*;
import Observer.*;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockObservable iphoneObservable = new IphoneObservableImpl();
		
		NotificationAlertObserver observer1=new EmailAlertObserver("abc@gmail.com",iphoneObservable);
		NotificationAlertObserver observer2=new EmailAlertObserver("xyz@gmail.com",iphoneObservable);
		NotificationAlertObserver observer3=new MobileAlertObserver("abx_username",iphoneObservable);
		
		iphoneObservable.add(observer1);
		iphoneObservable.add(observer2);
		iphoneObservable.add(observer3);
		
		iphoneObservable.getStockCount();
		iphoneObservable.setStockCount(10);
		iphoneObservable.setStockCount(20);
	}

}
