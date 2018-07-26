public class SoftwareDeveloper implements Employee
{
	private final int BASE_SALARY = 55000;

	private String name;
	private int salary;

	public SoftwareDeveloper(String name)
	{
		this.name = name;
		salary = BASE_SALARY;
	}

	public String getNameAndRole()
	{
		return name + " (software developer)";
	}

	public int getSalary()
	{
		return salary;
	}
}