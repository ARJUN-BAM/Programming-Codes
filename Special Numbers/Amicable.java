import java.util.Scanner;
class Amicable 
{
	public static void main(String [] args)
	{
		for(int i = 1;i<=10000;i++)
			if(isAmicable(i,0,0,i))
				System.out.print(i+" ");

	}
	public static boolean isAmicable(int num,int temp,int ite,int dup)
	{
		if(temp==dup&&ite==1)
			return false;
		else if(temp==dup)
			return true;
		else if(ite<2)
		{
			temp=0;
			for(int i = 1;i<=num/2;i++)
				if(num%i==0)
					temp+=i;
			return isAmicable(temp,temp,++ite,dup);
		}
		else
			return false;
	}
}