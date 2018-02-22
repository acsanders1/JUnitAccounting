package JunitAccount.JunitAccount;

import java.util.Date;

public class Account 
{
	private int id;
	private double balance;
	private double interestRate;
	private Date date;
	
	public Account()
	{
		date = new Date();
	}
	
	public Account(int id, double balance, double interestRate)
	{
		this.id = id;
		this.balance = balance;
		date = new Date();
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public double getInterestRate() 
	{
		return interestRate;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}

	public Date getDate() 
	{
		return date;
	}

	public void setDate(Date date) 
	{
		this.date = date;
	}

	@Override
	public String toString()
	{
		return "Account [id=" + id + ", balance=" + balance + ", interestRate=" + interestRate + ", date=" + date + "]";
	}
	
}
