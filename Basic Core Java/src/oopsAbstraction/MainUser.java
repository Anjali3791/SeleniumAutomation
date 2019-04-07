package oopsAbstraction;

public class MainUser {

	public static void main(String[] args) {
			
		RBI obj = new HDFC(); //example of non-premitive datatype (also RBI obj;)
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
		//ICICI Bank
		obj = new ICICI();
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
		//PNB Bank
		obj = new PNB();
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
		
	}

}
