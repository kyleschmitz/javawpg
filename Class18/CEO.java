public class CEO implements Employee
{
	private final int BASE_SALARY = 1000000;
	private int bonuses;

	private String name;
	private int salary;

	public CEO(String name)
	{
		this.name = name;
		salary = BASE_SALARY;
		bonuses = 100 * name.length();
	}

	public String getNameAndRole()
	{
		return name + " (CEO)";
	}

	public int getSalary()
	{
		return salary + bonuses;
	}

	public void fireEmployee()
	{
		//Fire some employee
	}
}