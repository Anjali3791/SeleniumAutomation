package oopsAbstraction;

public class BankUser2 {

	public static void main(String[] args) {
		
		//This is Runtime binding or Runtime Polymorphism
		//When we use reference of parent class and object of child class
		
		RBI obj = null; //reference that by default where it is pointing
		
		String bank =  "HDFC";  //provide value - here wrt selenium we can bring it from excel sheet
		
		if (bank.equals("ICICI"))
		{
			obj = new ICICI();
			
		}
		
		else if (bank.equals("PNB")) {
			
			obj = new PNB();
			
		}
		else if (bank.equals("HDFC")) {
			
			obj = new HDFC();
		}
		
		
//		obj = new HDFC();       //example of non-premitive datatype (also RBI obj;)
//			
//		obj = new ICICI();		//ICICI Bank
//				
//		obj = new PNB();		//PNB Bank
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
	}

}
