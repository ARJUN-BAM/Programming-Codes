import java.util.Scanner;
class UglyNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(isUgly(num));
	}
	public static boolean isUgly(int n)
	{
		if(n==1)
			return true;
		else if(n%2==0)
			return isUgly(n/2);
		else if(n%3==0)
			return isUgly(n/3);
		else if(n%5==0)
			return isUgly(n/5);
		else
			return false;

	}
}