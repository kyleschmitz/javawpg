public class Payroll
{
	public static void main(String[] args)
	{
		Employee[] employees = new Employee[3];

		employees[0] = new Receptionist("Kyle");
		employees[1] = new SoftwareDeveloper("Joe");
		employees[2] = new CEO("Robert the amazing the 3rd");

		for (int i = 0; i< employees.length; i++)
		{
			System.out.println(employees[i].getNameAndRole() + " is making $" + employees[i].getSalary());
		}

	}
}