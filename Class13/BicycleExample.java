public class BicycleExample
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_BICYCLES = 10;

		Bicycle[] bikes = new Bicycle[NUMBER_OF_BICYCLES];

		for (int i=0; i<bikes.length; i++)
		{
			bikes[i] = new Bicycle();

			if (i % 2 == 1)
			{
				bikes[i].accelerate(10);	
			}

			System.out.println("Bicycle number " + i + ": " + bikes[i].toString());
		}
	}
}