public class Savings extends BankAccount
{
	public Savings(double balance, String owner)
	{
		super(balance, owner);
	}

	public double getInterestRate()
	{
		return 2.5;
	}
}