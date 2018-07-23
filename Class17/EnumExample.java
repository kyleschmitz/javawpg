import java.util.Scanner;

public class EnumExample
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the day of the week: ");
		int dayAsIndex = scanner.nextInt();
		DaysOfTheWeek day = DaysOfTheWeek.values()[dayAsIndex];

		if (day == DaysOfTheWeek.Monday || day == DaysOfTheWeek.Wednesday || day == DaysOfTheWeek.Thursday)
		{
			System.out.println("You have class today.");
		}
		else
		{
			System.out.println("You do not have class today.");
		}
	}
}