public class Savings implements Account
{
	private int balance;

	public Savings(int balance)
	{
		this.balance = balance;
	}

	public int getBalance()
	{
		return balance;
	}

	public void withdrawFunds(int amount)
	{
		balance -= amount;
	}
}