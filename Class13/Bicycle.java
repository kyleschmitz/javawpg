public class Bicycle
{
	private int _speed;

	public Bicycle()
	{
		_speed = 0;
	}

	public void accelerate(int additionalSpeed)
	{
		_speed += additionalSpeed;
	}

	public String toString()
	{
		return String.valueOf(_speed);
	}
}