package JunitAccount.JunitAccount;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import JunitAccount.JunitAccount.Account;
import JunitAccount.JunitAccount.Accounting;

public class TestAccounting 
{
	Accounting accounting = new Accounting();
	Account account = new Account(1, 50.00, 10.517);
	
	@Before
	public void setUp() throws Exception
	{
		
	}
	
	@Test
	public void testWithdraw()
	{
		account.setBalance(60.00);
		account.setBalance(accounting.withdraw(account.getBalance(), 20.00));
		double accountBalance = account.getBalance();
		assertEquals(40.0, accountBalance, 0.00);
	}
	
	@Test
	public void testBalance()
	{
		account.setBalance(20.00);
		account.setBalance(accounting.deposit(account.getBalance(), 40.00));
		double accountBalance = account.getBalance();
		assertEquals(60.0, accountBalance, 0.00);
	}
}
