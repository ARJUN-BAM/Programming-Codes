import java.util.Scanner;
class SquareRoot
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Number : ");
		int num = new Scanner(System.in).nextInt();
		for(int i = 1 ; i<=num/2;i++)
		{
			if(i*i==num)
			{
				System.out.println(i+ " is the square root of "+num);
				System.exit(0);
			}
		}
		System.out.println(num+" does not have a Perfect Square Root!!!");
	}
}