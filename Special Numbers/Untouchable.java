import java.util.Scanner;
class Untouchable 
{
	public static void main(String [] args)
	{
		for(int i = 1;i<=100;i++)
			if(isUntouch(i))
				System.out.print(i+" ");
	}
	public static boolean isUntouch(int num)
	{
		int temp  = factSum(num);
		if(num>temp)
			return false;
		else
		{
			for(int i = 1;i<=num/2;i++)
			{
				if(num%i==0)
				{
					if(temp-i==num)
						return true;
				}
			}
			return false;
		}
	}
	public static int factSum(int num)
	{
		int factofSum = 0;
		for(int i = 1;i<=num/2;i++)
			if(num%i==0)
				factofSum+=i;
		return factofSum;
	}
}