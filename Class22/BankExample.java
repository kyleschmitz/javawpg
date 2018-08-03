public class BankExample
{
	public static void main(String[] args)
	{
		PrintOutBankingInfo(new Savings(100, "Kyle"));
	}

	public static void PrintOutBankingInfo(BankAccount account)
	{
		System.out.println(account.getOwner() + "'s account has interest rate is: " + account.getInterestRate());
	}
}