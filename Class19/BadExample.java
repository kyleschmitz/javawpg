import java.text.DecimalFormat;

public class BadExample
{
	public static void main(String[] args)
	{
		ATM atm = new ATM();
		BankAccount account = new BankAccount();

		System.out.println("Welcome to ComIT bank!");

		int menuChoice = atm.GetMenuChoice();

		while (menuChoice != 5)
		{
			switch(menuChoice)
			{
				case 1:
					ShowBalance(account);
					break;
				case 2:
					MakeADeposit(account);
					break;
				case 3:
					MakeAWithdrawal(account);
					break;
				case 4:
					MakeATransfer(account);
					break;
				default:
					System.out.println("Not a valid option");
					break;
			}

			menuChoice = atm.GetMenuChoice();
		}

		System.out.println("Thanks for using ComIT bank!");
	}

	public static void ShowBalance(BankAccount account)
	{
		System.out.println("Account balance is $" + account.toString());
	}

	public static void MakeADeposit(BankAccount account)
	{
		double amount = ATM.GetAmount();
		if (amount <= 0)
		{
			System.out.println("Invalid amount!");
		}
		else
		{
			account.depositFunds(amount);
		}
	}

	public static void MakeAWithdrawal(BankAccount account)
	{
		double amount = ATM.GetAmount();
		if (amount > 0)
		{
			boolean successful = account.withdrawFunds(amount);
			if (successful)
			{
				System.out.println("Successfully withdrew $" + account.toString());
			}
			else
			{
				System.out.println("Account balance is $" + account.toString());
			}
		}
	}

	public static void MakeATransfer(BankAccount account)
	{
		double amount = ATM.GetAmount();
		if (amount > 0)
		{
			boolean successful = account.withdrawFunds(amount);

			if (successful)
			{
				System.out.println("Successfully transferred $" + account.toString());
			}
			else
			{
				System.out.println("Account balance is $" + account.toString());
			}
		}
	}
}