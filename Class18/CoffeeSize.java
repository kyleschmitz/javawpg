public enum CoffeeSize
{
	SMALL(50), MEDIUM(100), LARGE(200), EXTRALARGE(500);

	private int ml;

	private CoffeeSize(int ml)
	{
		this.ml = ml;
	}

	public int getCapacity()
	{
		return ml;
	}
}