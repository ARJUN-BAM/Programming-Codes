import java.util.Scanner;
class DigitSum
{
	public static void main(String[] agrs)
	{
		System.out.print("Enter four digit number : ");
		int num = new Scanner(System.in).nextInt();
		int rem = num%10;
		int even = 0;
		int odd = 0;
		even = even+ (rem%2==0?rem:0);
		odd  = odd + (rem%2==1?rem:0);
		num = num/10;
		//THREE 
		rem = num%10;
		even = even+ (rem%2==0?rem:0);
		odd  = odd + (rem%2==1?rem:0);
		num = num/10;
		//TWO
		rem = num%10;
		even = even+ (rem%2==0?rem:0);
		odd  = odd + (rem%2==1?rem:0);
		num = num/10;
		//ONE
		rem = num%10;
		even = even+ (rem%2==0?rem:0);
		odd  = odd + (rem%2==1?rem:0);
		System.out.println("Even sum : "+even + " & Odd sum : "+odd);
	}
}