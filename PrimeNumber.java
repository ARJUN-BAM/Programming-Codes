import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] agrs)
	{
		System.out.print("Enter A Number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println((num==2||num==3||num==5)?(num + " is a prime number."):((num%2==0||num%3==0||num%5==0)?(num + " is not a prime number"):(num + " is a prime number")) );
	}
}