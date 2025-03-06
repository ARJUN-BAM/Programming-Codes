import java.util.Scanner;
class Xylem 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(isXylem(num));
	}
	public static boolean isXylem(int num)
	{
		int sumExt = 0,sumMid =0;
		sumExt+=num%10;
		num/=10;
		while(num>9)
		{
			sumMid+=num%10;
			num/=10;
		}
		sumExt+=num;
		return sumExt==sumMid;
	}
}