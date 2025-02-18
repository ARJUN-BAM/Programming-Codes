class Pattern8 
{
	public static void main(String [] args)
	{
		int n = 7;
		int m = 1;
		int temp = 1;
		for(int i = 1;i<=4;i++)
		{
			System.out.print(i+" ");
			int t=i;
			for(int j =2;j<=5;j++)
			{
				if(j%2==0)
					t+=n;
				else
					t+=m;
				System.out.print(t+" ");
			}			
			n-=2;
			m+=2;
			System.out.println();	
		}
	}
}


/*

1 8 9 16 17
2 7 10 15 18
3 6 11 14 19
4 5 12 13 20

*/