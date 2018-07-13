public class ReferenceExample
{

	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;

		ChangeValue(a);

		System.out.println("First value is: " + a);
		System.out.println("Second value is: " + b);
	}

	public static void ChangeValue(int a)
	{
		a = 20;
	}

	public static void main(String[] args)
	{
		Student student1 = new Student("Bob");
		Student student2 = new Student("Fred");

		ChangeStudentName(student1);

		System.out.println("First value is: " + student1.toString());
		System.out.println("Second value is: " + student2.toString());
	}

	public static void ChangeStudentName(Student student)
	{
		student.setName("Joe");

	}
}