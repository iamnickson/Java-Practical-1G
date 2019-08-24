public class TestCreditCard{
	public static void main(String[] args){
		CreditCard[] wallet=new CreditCard[3];
		wallet[0]=new CreditCard("Abc", "HNB", "123 456 789", 5000);
		wallet[1]=new CreditCard("Def", "NSB", "456 789 123", 3500);
		wallet[2]=new CreditCard("Ghi", "BOC", "789 123 456", 2500, 300);

		for(int val=1; val<=16; val++){
			wallet[0].charge(1*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}

		for(CreditCard card:wallet){
			CreditCard.printSummary(card);
			while(card.getBalance()>200.0){
				card.makePayment(400);
				System.out.println("New balance of "+card.getAccount()+" is " +card.getBalance());
			}
		}
		System.out.println("____________________");
		for(CreditCard card:wallet){
		CreditCard.increaseSpendingLimit(card,500);
		}
		for(int val=1; val<=16; val++){
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}

		for(CreditCard card:wallet){
			CreditCard.printSummary(card);
			while(card.getBalance()>200.0){
				card.makePayment(500);
				System.out.println("New balance "+card.getBalance());
			}
		}
		System.out.println("____________________");
		for(CreditCard card:wallet){
			System.out.println(card.nonStaticticPrintSummary());
		}
	}
}