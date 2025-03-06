import java.util.Scanner;
class RecSumOfDigit 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(digitSum(num,0));
	}
	public static int digitSum(int num,int sum)
	{
		if(num==0)
			return sum;
		else
			return digitSum(num/10,sum+=(num%10));
	}
}