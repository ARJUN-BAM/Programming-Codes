class TwinPrimes 
{
	public static void main(String [] args)
	{
		for(int i = 2;i<=100;i++)
			twinPrime(i);
	}
	public static void twinPrime(int num)
	{
		if(isPrime(num,2)&&isPrime(num+2,2))
			System.out.println(num+" "+(num+2));
		
	}
	public static boolean isPrime(int num,int a)
	{
		if(num==a)
			return true;
		else if(num%a==0)
				return false;
		else
			return isPrime(num,++a);

	}
}