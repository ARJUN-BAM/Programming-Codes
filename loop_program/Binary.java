//Evil Number is a number whose the number of 1's value in the binary value of the same number is even. 
import java.util.Scanner;
class Binary 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int temp = num;
		String sum = "";
		int cnt=0;
		while(num>0)
		{
			int rem = num%2;
			if(rem==1)
				cnt++;
			sum=rem+sum;
			num/=2;
		}


		// String bin = Integer.toBinaryString(temp);  For Inbuilt Method use
		// System.out.println(bin);


		// int num2= Integer.ParseInt(temp,2);
		// For converting Binary to Decimal

		
		System.out.println(sum);

		if(cnt%2==0)
			System.out.print("Evil Number");
		else{
			System.out.print("Not Evil Number");

		}
	}
}


