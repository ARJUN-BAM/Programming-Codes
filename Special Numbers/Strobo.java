import java.util.Scanner;
class Strobo 
{
	public static void main(String [] args)
	{
		for(int i = 11;i<=1000``;i++)
			if(isStrobo(i))
				System.out.print(i+" ");
	}
	public static boolean isStrobo(int num)
	{
		for(int i = num;i>0;i/=10)
		{
			if(i%10==2||i%10==3||i%10==4||i%10==5||i%10==7)
				return false;
		}
		int rev = revNum(num);
		// System.out.println(num+ " "+rev);

		while(num>0)
		{
			int a = num%10;
			int b = rev%10;
			// System.out.println(a+" "+b);
			if((a==0&&b==0)||(a==1&&b==1)||(a==6&&b==9)||(a==8&&b==8)||(a==9&&b==6))
			{
				num/=10;
				rev/=10;
			}
			else{
				return false;
			}
		}
		return true;

	}
	public static int revNum(int num){
		int rev = 0;
		for(int i = num;i>0;i/=10)
		{
			rev = rev*10 + i%10;
		}
		return rev;
	}
}