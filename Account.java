public class Account
{
	int accountNo;
	double balance;
	double credit;
	double debit;
	double Balance;
	
	
	void getAccountNo(int acno)
	{
		accountNo=acno;
	}
	void setBalance(double balance)
	{
		Balance=balance;
		
	}
	void credit(double credit)
	{
		Balance = Balance + credit;
	}
	void debit(double debit)
	{
		Balance = Balance - debit;
	}
	
	String ToString()
	{
		String detail = "Account number: "+accountNo+"\nBalance: 	"+Balance;
		return detail;
	}
}
