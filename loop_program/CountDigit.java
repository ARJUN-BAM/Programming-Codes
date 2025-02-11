/*to find duplicate digits we use one digit loop from 0 to 9 for checking every digit from the number and printing their count until whole number's digit is checked*/
class CountDigit
{
	public static void main(String[] args)
	{
		long num = 1214314131657248l;
		int max = 0,dgt = 0;
		
		for(int i=0;i<=9;i++)	
		{
			int cnt = 0;
			for(long j=num;j>0;j/=10)
			{
				if(i==(int)(j%10))
				cnt++;
			}
			if(cnt>max)
			{
				max=cnt;
				dgt =i;
				
			}
		}
	}
}