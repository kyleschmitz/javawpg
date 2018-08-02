public class AbstractExample
{
	public static void main(String[] args)
	{
		Parent child = new Child(10, 20);
		System.out.println(child.toString());
	}
}