import java.util.Scanner;
class EvenToOdd
{
	public static void main(String[] args)
	{
		System.out.println("Enter Number");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		int len =0;
		for(int i = num;i>0;i/=10)
		{
			len++;
		}
		int temp=0; 
		if(len%2==1)
		{	
			for(int i=num;i>0;i/=10)
			{
				int rem = i%10;    
				if(rem%2==0)		
				rem+=1;
				sum+=rem*(Math.pow(10,temp++));			
			}
		}
		else
		{
			for(int i=num;i>0;i/=10)
			{
				int rem = i%10; 
				if(rem==9)
				rem=0;   
				if(rem%2==1)		
				rem+=1;
				sum+=rem*(Math.pow(10,temp++));			
			}
		}
		
		System.out.println(num+" : "+sum);
	}
}