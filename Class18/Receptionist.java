public class Receptionist implements Employee
{
	private final int BASE_SALARY = 35000;

	private String name;
	private int salary;

	public Receptionist(String name)
	{
		this.name = name;
		salary = BASE_SALARY;
	}

	public String getNameAndRole()
	{
		return name + " (receptionist)";
	}

	public int getSalary()
	{
		return salary;
	}
}