// A Tech Number is an Even length number whose Square of Addition of its First half and last half is the original number only.
// Example : 2025 -> 20 + 25 -> 45^2 ->2025
import java.util.Scanner;
class TechNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int len = 0;
		for(int i=num;i>0;i/=10)
			len++;
		if(len%2==0)
		{
			int div = (int)Math.pow(10,(len/2));
			int sum = (int)Math.pow((num%div)+(num/div),2); //num/div: First Half & num%div: Last half
			if(num==sum)
			{
				System.out.println("Tech Number");
			}else{
				System.out.println("Not a Tech Number");
			}
		}else{
				System.out.println("Not a Tech Number");
			}
		

	}
}