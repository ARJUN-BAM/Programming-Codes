import java.util.Scanner;
class SphenicNumber 
{
	public static void main(String [] args)
	{
		for(int i=30;i<=1000;i++)
		{
			if(isSphenic(i))
				System.out.print(i+" ");
		}
	}
	public static boolean isSphenic(int num)
	{
		if(isPrime(num,2))
			return false;
		else
		{
			int fact = 1,time=0;
			int temp=2;
			while(num!=1&&time<3)
			{
				if(num%temp==0)
				{
					if(fact%temp==0)
						return false;
					num/=temp;
					fact*=2;
					time++;
				}
				else if(num%nextPrime(temp)==0)
				{
					temp = nextPrime(temp);
					if(fact%temp==0)
						return false;
					fact*=temp;
					num/=temp;
					temp=2;
					time++;
				}
				else
					temp=nextPrime(temp);
			}
			if(time==3&&num==1)
			{
				return true;
			}
			else{
				return false;
			}
			
		}
	}
	public static boolean isPrime(int num,int temp)
	{
		if(num==temp)
			return true;
		else if(num%temp==0)
			return false;
		else
			return isPrime(num,++temp);
	}
	public static int nextPrime(int num)
	{
		if(isPrime(num+1,2))
			return num+1;
		else
			return nextPrime(num+1);
	}

}