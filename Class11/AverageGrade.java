import java.util.Scanner;

public class AverageGrade
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[3];

		for(int i=0; i<3; i++)
		{
			students[i] = new Student();
			System.out.print("Enter name: ");
			students[i].firstName = scanner.next();
		}


		for(int i=0; i<3; i++)
		{
			System.out.println("Name " + (i + 1) + " is "  + students[i].firstName);
		}		
	}
}