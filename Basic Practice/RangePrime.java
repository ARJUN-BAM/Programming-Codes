import java.util.Scanner;
class RangePrime
{
	public static void main(String[] args)
	{
		int num = new Scanner(System.in).nextInt();
		int n1=num+1;
		int n2=num-1;

		for(int i =2;i<=(n1/2);i++)
		{
			if(n1 %i==0)
			{
				n1++;
				i=2;
				
			}
		}
		for(int i =2;i<=(n2/2);i++)
		{
			if(n2 %i==0)
			{
				n2--;
				i=2;
				
			}
		}
		
		if((n1-num)!=(num-n2))
		{
			System.out.println(num+" "+(((n1-num)>(num-n2))?(n2):(n1)));
		}
		else
		{
			System.out.println(n2+" "+num+" "+n1);
		}
		
	}
}