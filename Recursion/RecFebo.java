import java.util.Scanner;
class RecFibo 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		febonacciNumber(num,0,1);
	}
	public static void febonacciNumber(int n , int num1,int num2)
	{
		if(n==0)
			return;
		else
		{
			int num3 = num1+num2;
			System.out.println(num1);
			febonacciNumber(--n,num2,num3);
		}
	}
}