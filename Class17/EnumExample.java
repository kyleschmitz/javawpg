import java.util.Scanner;

public class EnumExample
{
	public static void main(String[] args)
	{
		DaysOfTheWeek day = DaysOfTheWeek.Tuesday;

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