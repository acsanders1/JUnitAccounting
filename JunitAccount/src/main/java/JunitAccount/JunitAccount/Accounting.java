package JunitAccount.JunitAccount;

public class Accounting 
{
	
	public double withdraw(double balance, double amount)
	{
		return balance -= amount;
	}
	
	public double deposit(double balance, double amount)
	{
		return balance += amount;
	}
}
