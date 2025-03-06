import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		int num = new Scanner(System.in).nextInt();
		int sum =0,len=0;
		for(int i = num ; i>0 ;i/=10)
			len++;
		
		for(int i = num ; i>0 ;i/=10)
		{
			int pow = len;
			int temp = 1;
			int rem = i%10;
			while(pow>0)
			{
				temp*=rem;
				pow--;
			}
			sum+=temp;
		}
		System.out.println((sum==num)?("Armstrong"):("Not Armstrong"));
	}
}