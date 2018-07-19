public class BikeCounter
{
	public static void main(String[] args)
	{
		final int TOTAL_BIKES = 5;
		Bicycle[] bikes = new Bicycle[TOTAL_BIKES];

		bikes[0] = new Bicycle("Blue");
		bikes[1] = new Bicycle("Yellow");
		bikes[2] = new Bicycle("Red");
		bikes[3] = new Bicycle("Black");
		bikes[4] = new Bicycle("Green");


		for(int i=0; i<bikes.length; i++)
		{
			System.out.println("Bike ID: " + bikes[i].getId() + " has color " + bikes[i].getColor() + " *** " + bikes[i].getLastId());
		}

		System.out.println("The last ID used was: " + Bicycle.getLastId());
	}
}