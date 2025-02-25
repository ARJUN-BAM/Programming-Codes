import java.util.Scanner;
class Pattern2 
{
	public static void main(String [] args)
	{
		int num = 0;
		int a =1;
		for(int i =0;i<4;i++)
		{
			num+=i+1;
			int k = num;
			for(int j = 0; j <= i ; j++)
			{
				System.out.print((num--)+ " ");
			}
			num = k;
			System.out.println();
			
		}
	}
}



/*
1
3 2 
6 5 4
10 9 8 7


num = num + i+ 1;
k=num;
interation 
num--
num=k;


num = 1 -> 0+1+0
k = 1,3



num => 1+1+1 => 3-- -> 2
k->3
3
num = 3
k = 6

*/