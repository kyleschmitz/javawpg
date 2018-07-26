public class CoffeeShop
{
	public static void main(String[] args)
	{
		CoffeeSize coffee = CoffeeSize.MEDIUM;

		int capacity = coffee.getCapacity();

		System.out.println("The capacity is " + capacity + " ml");
	}
}