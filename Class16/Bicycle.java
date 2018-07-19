public class Bicycle
{
	private int id;
	private static int lastId = 0;
	private String color;

	public Bicycle(String color)
	{
		lastId++;
		id = lastId;
		this.color = color;
	}

	public int getId()
	{
		return id;
	}

	public String getColor()
	{
		return color;
	}

	public static int getLastId()
	{
		return lastId;
	}
}