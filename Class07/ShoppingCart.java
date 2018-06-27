import java.util.Scanner;

public class ShoppingCart
{
	public static void main(String[] args)
	{
		String itemName = ReadTextFromKeyboard("Please enter the item name: ");
		double itemPrice = ReadDoubleFromKeyboard("Please enter the item price: ");
		double taxRate = ReadDoubleFromKeyboard("Please enter the tax rate in percent: ");

		double amountOwed = CalculateAmountOwed(itemPrice, taxRate);

		PrintCustomerReceipt(itemName, itemPrice, taxRate, amountOwed);

		double amountGivenByCustomer = GetAmountGivenByCustomer(amountOwed);

		PrintFinalReceipt(amountGivenByCustomer, amountOwed);
	}

	public static double CalculateAmountOwed(double itemPrice, double taxRate)
	{
		return itemPrice * ((taxRate / 100) + 1);
	}

	public static void PrintCustomerReceipt(String itemName, double itemPrice, double taxRate, double amountOwed)
	{
		System.out.println();
		System.out.println("The name of the item is: " + itemName);
		System.out.println("The price of the item is: $" + itemPrice);
		System.out.println("The tax amount is: " + taxRate + "%");
		System.out.println("The total amount owed is: $" + amountOwed);
	}

	public static void PrintFinalReceipt(double amountGivenByCustomer, double amountOwed)
	{
		System.out.println();
		System.out.println("The amount the customer gave was: $" + amountGivenByCustomer);
		System.out.println("The change owed to the customer is: $" + (amountGivenByCustomer - amountOwed));
		System.out.println("Thank you for visiting the store!");
	}

	public static double GetAmountGivenByCustomer(double amountOwed)
	{
		double amountGivenByCustomer =  ReadDoubleFromKeyboard("Please enter amount of money customer gave: ");

		while (amountGivenByCustomer < amountOwed)
		{
			amountGivenByCustomer = ReadDoubleFromKeyboard("Sorry, that's not enough money. Please enter a new amount: ");
		}

		return amountGivenByCustomer;
	}

	public static String ReadTextFromKeyboard(String prompt)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print(prompt);

		return scanner.next();
	}

	public static double ReadDoubleFromKeyboard(String prompt)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print(prompt);

		return scanner.nextDouble();
	}
}