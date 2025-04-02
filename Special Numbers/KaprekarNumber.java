class KaprekarNumber 
{
	public static void main(String [] args)
	{
		for(int i=1;i<=10000;i++)
			if(isKapre(i))
				System.out.print(i+" ");
	}
	public static boolean isKapre(int num)
	{
		int temp = num*num;
		int a=1,i=10;
		do
		{
			a = temp%i;
			if(a+(temp/i)==num&&a!=0)
				return true;
			else
				i*=10;
		}while(a!=temp);
		return false;
	}
}
