import java.util.Scanner;
class OddToEven
{
	public static void main(String[] args)
	{
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		
		int temp=0;
		for(int i=num;i>0;i/=10)
		{
			int rem = i%10;     
			if(rem==9)
			rem=0;
			if(rem%2==1)
			rem+=1;
			sum+=rem*(Math.pow(10,temp++));				
		}
		System.out.println(num+" : "+sum);
	}
}