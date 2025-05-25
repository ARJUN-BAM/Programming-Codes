class Example 
{
	public static void main(String [] args)
	{
		int num = 113;
		// System.out.println((Prime(num))?"Prime Number":"Not Prime Number");

	}
	public static boolean Prime(int num)
	{
		if(num<2)
		{
			return false;
		}
		for(int i = 2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}