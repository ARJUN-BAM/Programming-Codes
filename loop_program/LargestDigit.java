import java.util.Scanner;
class LargestDigit
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int max = 0;
		int min = 9;
		
		if(args[0].equals("M")||args[0].equals("m"))
		{
			for(int i=num;i>0;i/=10)
			{
				max=(max<(i%10))?(i%10):(max);
			}
			System.out.println("The largest digit in "+num+" is "+max);
		}
		else if(args[0].equals("S")||args[0].equals("s"))
		{
			for(int i=num;i>0;i/=10)
			{
				min=(min>(i%10))?(i%10):(min);
			}
			System.out.println("The smallest digit in "+num+" is "+min);
		}
		
		
		
	}
}