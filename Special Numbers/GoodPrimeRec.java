class GoodPrimeRec 
{
	public static void main(String [] args)
	{
		int num = 50;
		GoodPrime(num);
	}
	public static boolean isPrime(int num)
	{
		if(num<2)
			return false;
		else
		{
			for(int i =2;i<=num/2;i++)
				if(num%i==0)
					return false;
			return true;
		}
	}
	public static void GoodPrime(int num)
	{
		home :
		for(int i=2;i<num;i++)
		{
			if(isPrime(i))
			{
				if(i<10)
					System.out.print(i + "  ");
				else
				{
					for(int j = i ; j>0;j/=10)
					{
						if(isPrime(j%10))
							continue;
						else
							continue home;
					}
					System.out.print(i+ " ");
				}
			}
		}
	}
}