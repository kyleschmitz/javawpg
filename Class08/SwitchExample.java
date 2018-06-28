import java.util.Scanner;

public class SwitchExample
{
	public static void main(String[] args)
	{
		String userInput;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter in the day of the week: ");
		userInput = scanner.next();

		switch(userInput)
		{
			case "Monday":
			case "Wednesday":
			case "Thursday":
				System.out.println("You have class today.");
				break;
			case "Tuesday":
			case "Friday":
				System.out.println("You do not have class today.");
				break;
			case "Saturday":
			case "Sunday":
				System.out.println("It's the weekend");
				break;
			default:
				System.out.println("Not a valid input");
				break;
		}
	}
}