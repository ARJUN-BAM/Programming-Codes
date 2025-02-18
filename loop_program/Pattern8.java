class Pattern8 
{
	public static void main(String [] args)
	{
		int n = 7;
		int m = 2;
		int temp = 1;
		for(int i = 1;i<=5;i++)
		{
			int t =i;
			for(int j =1;j<=i;j++)
			{
				System.out.print(t+" ");
				if(j%2==1&&i<1)
				{
					t-=m;
				}
				else{
					t+=n;
				}
			}			
			n-=2;
			System.out.println();
			if(i>2)
				m+=2;
		}
	}
}


/*

1
2 9 
3 8 10
4 7 11 14 
5 6 12 13 15

*/