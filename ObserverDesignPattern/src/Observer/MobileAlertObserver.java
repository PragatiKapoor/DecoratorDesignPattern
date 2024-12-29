package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
	
	String userName;
	StockObservable observable; //constructor injection
	public MobileAlertObserver(String userName,StockObservable observable) {
		this.userName=userName;
		this.observable=observable;
	}
	
	@Override
	public void update() {
		sendEmail(userName, "product is in stock ! Hurry up!");
		
	}
	public void sendEmail(String emaiuserNamelId,String msg) {
		System.out.println("msg sent to :" +userName);
	}
}
