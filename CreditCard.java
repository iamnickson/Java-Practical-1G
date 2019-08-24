public class CreditCard{
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;

	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
		customer=cust;
		bank=bk;
		account=acnt;
		limit=lim;
		balance=initialBal;
	}
	public CreditCard(String cust, String bk, String acnt, int lim){
		this(cust, bk, acnt, lim, 0.0);
	}
	public String getCustomer(){
		return customer;
	}
	public String getBank(){
		return bank;
	}
	public boolean charge(double price){
		balance=getBalance()+price;
		if(balance>limit){
			System.out.println("Not enough balance");
			return false;
		}
		else{
			return true;
		}
	}
	public double makePayment(double amt){
		if(getBalance()>=amt){
			balance=getBalance()-amt;
		}
		else{
			System.out.println(getAccount()+" has negative balance of "+(amt-getBalance()));
			balance=0;
		}
		return balance;
	}
	public String getAccount(){
		return account;
	}
	public int getLimit(){
		return limit;
	}
	public double getBalance(){
		return balance;
	}
	public static void increaseSpendingLimit(CreditCard card,int s){
		card.limit=card.limit+s;
    }
	public static void printSummary(CreditCard card){
		System.out.println("Customer	"+card.customer);
		System.out.println("Bank		"+card.bank);
		System.out.println("Account		"+card.account);
		System.out.println("Balance		"+card.balance);
		System.out.println("Limit		"+card.limit);
		System.out.println("");
	}
	public void nonStaticticPrintSummary(CreditCard card){
		System.out.println("Customer	"+card.customer);
		System.out.println("Bank		"+card.bank);
		System.out.println("Account		"+card.account);
		System.out.println("Balance		"+card.balance);
		System.out.println("Limit		"+card.limit);
		System.out.println("");
	}
}