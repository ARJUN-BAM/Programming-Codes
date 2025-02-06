import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		float a = sc.nextFloat();
		System.out.print("Enter a number : ");
		float b = sc.nextFloat();
		System.out.print("Enter a Operator : ");
		char o = sc.next().charAt(0);
		float result = (o=='+')?(a+b):((o=='-')?(a-b):((o=='*')?(a*b):((o=='/')?(a/b):((o=='%')?(a%b):(Float.MIN_VALUE)))));
		
		if(!(result==Float.MIN_VALUE))
		{
			System.out.println(a+ " " + o + " "+ b+ " = " + result);
		}

		
	}
}