class Pattern7 
{
	public static void main(String [] args)
	{
		int num = 5,space = num/2,star=1;

		for(int i = 0; i<num;i++)
		{
			for(int j =0;j<space;j++)
				System.out.print("  ");
			for(int j = 0;j<star;j++)
				System.out.print("* ");
			if(i<num/2)
			{
				space--;
				star+=2;
			}
			else{
				space++;
				star-=2;
			}
			System.out.println();
		}

	}
}