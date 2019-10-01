public class TestAccount
{
	public static void main(String args [])
	{
		Account b1=new Account();
		Account b2=new Account();
		Account b3=new Account();
		
		b1.getAccountNo(2015058);
		b1.setBalance(50000);
		b1.credit(25000);
		b1.debit(10000);
		
		b2.getAccountNo(2015059);
		b2.setBalance(50000);
		b2.credit(15000);
		b2.debit(35000);
		
		b3.getAccountNo(2015060);
		b3.setBalance(50000);
		b3.credit(5000);
		b3.debit(45000);
		
		System.out.println("Detail of the customer: \n"+b1.ToString());
		System.out.println("");
		System.out.println("Detail of the customer: \n"+b2.ToString());
		System.out.println("");
		System.out.println("Detail of the customer: \n"+b3.ToString());
	}
}