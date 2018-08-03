public abstract class BankAccount
{
	protected double balance;
	protected String owner;

	public BankAccount(double balance, String owner)
	{
		this.balance = balance;
		this.owner = owner;
	}

	public abstract double getInterestRate();


	public String getOwner()
	{
		return owner;
	}

	// public String toString()
	// {
	// 	return owner + " has $" + balance;
	// }
}