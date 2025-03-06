class Lcm 
{
	public static void main(String [] args)
	{
		System.out.println(lcm(12,16));
	}
	public static int lcm(int a,int b)
	{
		int max = a>b?a:b;
		for(int i = 1;;i++)
		{
			if((i*a)%b==0)
				return i*a;
		}
	}
}