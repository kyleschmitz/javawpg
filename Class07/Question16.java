import java.util.Scanner;

public class Question16
{
	/******************************************
	* The main entry point to the application
	******************************************/
	public static void main(String[] args)
	{
		int startingNumber;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the starting number: ");
		startingNumber = scanner.nextInt(); //Reads in a number from the keyboard.

		for(int i=startingNumber; i<startingNumber + 100; i++)
		{
			sum += i;
		}

		System.out.println("The sum is " + sum);
	}
}