class AutobioNumber 
{
	public static void main(String [] args)
	{
		for(int i = 1;i<=Integer.MAX_VALUE;i++)
			if(isAutobio(i))
				System.out.print(i+" ");
	}
	public static boolean isAutobio(int num)//1210//121
	{
		int temp = countNum(num);
		int dup = num;
		do{
			int count = 0;
			for(int i = dup;i>0;i/=10)
				if(temp==i%10)
					count++;
			// System.out.println(count + " "+ (num%10)+" "+temp);
			if(count==num%10){
				temp--;
				num/=10;
			}
			else
				return false;
		}while(num>0);
		return true;
	}
	public static int countNum(int num)
	{
		int cnt = 0;
		for(int i=num;i>0;i/=10)
			cnt++;
		return cnt-1;
	}
}