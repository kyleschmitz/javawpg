import java.util.Scanner;

public class IfExample
{
	public static void main(String[] args)
	{
		String userInput;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter in the day of the week: ");
		userInput = scanner.next();

		if (userInput.equals("Monday") || userInput.equals("Wednesday") || userInput.equals("Thursday"))
		{
			System.out.println("You have class today.");
		}
		else if (userInput.equals("Tuesday") || userInput.equals("Friday"))
		{
			System.out.println("You do not have class today.");
		}
		else if (userInput.equals("Saturday") || userInput.equals("Sunday"))
		{
			System.out.println("It's the weekend");
		}
		else
		{
			System.out.println("Not a valid input");
		}
	}
}