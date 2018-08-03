public class Chequing extends BankAccount
{
	public Chequing(double balance, String owner)
	{
		super(balance, owner);
	}

	public double getInterestRate()
	{
		return 0.5;
	}
}