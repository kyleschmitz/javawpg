import java.util.Scanner;

public class Question17
{
	/******************************************
	* The main entry point to the application
	******************************************/
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double canadianAmount;
		double americanAmount;
		final double CONVERSION_RATE = 0.72;

		System.out.print("Please enter the amount in Canadian: ");
		canadianAmount = scanner.nextDouble();

		americanAmount = canadianAmount * CONVERSION_RATE;

		System.out.print("The amount in USD is: $" + americanAmount);
	}
}