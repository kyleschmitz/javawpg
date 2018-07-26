public class Chequing implements Account
{
	private int balance;

	public Chequing(int balance)
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

	public void writeCheque(int amount, String to)
	{
		System.out.println("Sending cheque to " + to);
	}
}