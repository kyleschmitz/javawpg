import java.util.Scanner;

public class Rocket
{
	public static void main(String[] args)
	{
		boolean rocketHasCrashed = false;

		while(!rocketHasCrashed)
		{
			System.out.println();
			System.out.println("***");
			System.out.println();

			int speedInMetersPerSecond = GetTheSpeedOfTheRocket();
			double neededFuel = CalculateNeededFuel((short)speedInMetersPerSecond);

			System.out.println("Sending " + neededFuel + " gallons of fuel to the engine to maintain flight!");

			if (neededFuel < 0)
			{
				rocketHasCrashed = true;
			}
		}

		System.out.println("Oh no! The rocket has crashed! You better start looking for a new job...");
	}


	public static int GetTheSpeedOfTheRocket()
	{
		int speedInMetersPerSecond;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the speed of the rocket in meters per second: ");
		speedInMetersPerSecond = scanner.nextInt();

		return speedInMetersPerSecond;
	}


	public static double CalculateNeededFuel(short speedInMetersPerSecond)
	{
		final double FUEL_RATIO = 0.2;
		double neededFuelInGallons = speedInMetersPerSecond * FUEL_RATIO;

		System.out.println("Calculating needed fuel for a speed of " + speedInMetersPerSecond + " meters per second.");
		System.out.println("Needed fuel in gallons is: " + neededFuelInGallons);
		return neededFuelInGallons;
	}
}