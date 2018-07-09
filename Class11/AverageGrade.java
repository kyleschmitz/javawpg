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
			System.out.print("Enter grade: ");
			students[i].grade = scanner.nextInt();
		}

		double averageGrade = 0;
		for(int i=0; i<3; i++)
		{
			averageGrade += students[i].grade;
		}

		averageGrade /= 3;

		System.out.println("The average grade is: " + averageGrade);
	}
}