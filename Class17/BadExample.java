import java.text.DecimalFormat;

public class BadExample
{
	public static void main(String[] args)
	{
		ATM atm = new ATM();
		BankAccount account = new BankAccount();

		System.out.println("Welcome to ComIT bank!");

		atm.PrintMenu();
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

			atm.PrintMenu();
			menuChoice = atm.GetMenuChoice();
		}

		System.out.println("Thanks for using ComIT bank!");
	}

	public static void ShowBalance(BankAccount account)
	{
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		System.out.println("Account balance is $" + decimalFormat.format(account.balance));
	}

	public static void MakeADeposit(BankAccount account)
	{
		ATM atm = new ATM();
		double amount = atm.GetAmount();
		if (amount <= 0)
		{
			System.out.println("Invalid amount!");
		}
		else
		{
			account.balance = account.balance + amount;
		}
	}

	public static void MakeAWithdrawal(BankAccount account)
	{
		ATM atm = new ATM();
		double amount = atm.GetAmount();
		if (amount <= 0)
		{
			System.out.println("Invalid amount!");
		}
		else
		{
			if (account.balance - amount < 0)
			{
				System.out.println("Insufficient funds.");

				DecimalFormat decimalFormat = new DecimalFormat("#0.00");
				System.out.println("Account balance is $" + decimalFormat.format(account.balance));
			}
			else
			{
				account.balance = account.balance - amount;

				DecimalFormat decimalFormat = new DecimalFormat("#0.00");
				System.out.println("Successfully withdrew $" + decimalFormat.format(account.balance));
			}
		}
	}

	public static void MakeATransfer(BankAccount account)
	{
		ATM atm = new ATM();
		double amount = atm.GetAmount();
		if (amount <= 0)
		{
			System.out.println("Invalid amount!");
		}
		else
		{
			if (account.balance - amount < 0)
			{
				System.out.println("Insufficient funds.");

				DecimalFormat decimalFormat = new DecimalFormat("#0.00");
				System.out.println("Account balance is $" + decimalFormat.format(account.balance));
			}
			else
			{
				account.balance = account.balance - amount;

				DecimalFormat decimalFormat = new DecimalFormat("#0.00");
				System.out.println("Successfully transferred $" + decimalFormat.format(account.balance));
			}
		}
	}
}