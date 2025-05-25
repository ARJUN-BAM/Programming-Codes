import java.util.Scanner;
class SumDigit
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num;
		int sum = 0;
		while(temp>0)
		{
			int rem = temp%10;
			sum += rem;
			temp/=10;
		}
		System.out.println("Sum of digits : "+sum);

	}
}