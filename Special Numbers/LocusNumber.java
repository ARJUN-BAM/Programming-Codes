class LocusNumber 
{
	public static void main(String [] args)
	{
		System.out.println(2);
		System.out.println(1);
		numLocus(2,1,0);
	}
	public static void numLocus(int n1,int n2,int temp)
	{
		if(temp>10)
			return;
		int n = n1+n2;
		System.out.println(n);
		numLocus(n2,n,++temp);
	}
}