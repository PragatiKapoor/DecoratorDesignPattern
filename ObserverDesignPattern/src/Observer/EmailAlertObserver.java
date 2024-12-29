package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
	
	String email;
	StockObservable observable; //constructor injection
	public EmailAlertObserver(String email,StockObservable observable) {
		this.email=email;
		this.observable=observable;
	}
	
	@Override
	public void update() {
		sendEmail(email, "product is in stock ! Hurry up!");
		
	}
	public void sendEmail(String emailId,String msg) {
		System.out.println("mail sent to :" +emailId);
	}

}
