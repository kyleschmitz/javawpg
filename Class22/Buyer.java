public class Buyer extends User
{
	private final static double BUYER_ACCOUNT_COST = 5;

	private double balance;

	public Buyer(String firstName, String lastName, String username, String password, double balance)
	{
		super(firstName, lastName, username, password);

		this.balance = balance;
	}

	public double getBalance()
	{
		return balance;
	}

	public double getCost()
	{
		return BUYER_ACCOUNT_COST;
	}
}