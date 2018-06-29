public class ArraysPractice1
{
	public static void main(String[] args)
	{
		int[] grades = new int[5];
		int averageGrade;

		grades[0] = 70;
		grades[1] = 100;
		grades[2] = 0;
		grades[3] = 85;
		grades[4] = 9;

		averageGrade = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;

		System.out.println("The average grade is: " + averageGrade);
	}
}