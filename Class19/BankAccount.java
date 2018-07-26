import java.text.DecimalFormat;

public class BankAccount
{
	private double balance;

	public double getBalance()
	{
		return balance;
	}

	public void depositFunds(double amount)
	{
		balance = balance - amount;
	}

	public boolean withdrawFunds(double amount)
	{
		if (balance - amount < 0)
		{
			System.out.println("Insufficient funds!");
			return false;
		}
		else
		{
			balance = balance - amount;
			return true;
		}
	}

	public String toString()
	{
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		return decimalFormat.format(balance);
	}
}