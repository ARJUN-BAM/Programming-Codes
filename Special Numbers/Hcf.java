class Hcf 
{
	public static void main(String [] args)
	{
		System.out.println(hcf(121,77));//campare hcf()==1 for checking if numbers are co-prime Numbers.
	}
	public static int hcf(int a , int b)
	{
		int min=a<b?a:b;
		int max=a>b?a:b;
		if(max%min==0)
			return min;
		else
			return hcf(max-min,min);
	}		
}