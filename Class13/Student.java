public class Student
{
	private String _name;

	public int getNameLength()
	{
		if (_name == null)
		{
			return -1;
		}
		else
		{
			return _name.length();
		}
	}
}