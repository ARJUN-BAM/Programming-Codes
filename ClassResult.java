import java.util.Scanner;
class ClassResult
{
	public static void main (String[] args)
	{
		System.out.print("Enter your Marks [Out of 600]: ");
		
		float marks = new Scanner(System.in).nextFloat();
		float per = (marks/600f)*100;
		System.out.println((per>=35)?((per<=60)?("C garde"):((per<=75)?("B Grade"):("A grade"))):("Student is Fail."));
	}
}