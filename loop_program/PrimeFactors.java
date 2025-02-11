import java.util.Scanner;
class PrimeFactors
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = s.nextInt();
		
		System.out.print("Factors of " + num+" : ");
		for(int i = 2; i<=num;i++)
		{
			if(num%i==0)
			{
				boolean flag = false;
				for(int j = 2;j<=(i/2);j++) 
				{
					if(i%j==0)
					{
						
						flag = true;
						
					}
					
				}
				
				if(flag==false)
				{
					System.out.print(i+" ");
				}
			}
			
		}
	}
}