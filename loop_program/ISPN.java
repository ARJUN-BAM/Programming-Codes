//ISBN number is a International Standard Book Number.
import java.util.Scanner;
class ISPN 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		long num = 1259060977l;
		int sum =0;
		for(long i = num,j=1; i>0;i/=10,j++)
		{
			sum+=(int)((i%10)*j);
		}
		System.out.println((sum%11==0)?(num+" is ISPN Number."):(num+" is not a ISPN Number."));
	}
}