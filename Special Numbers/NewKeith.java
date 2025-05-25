import java.util.Scanner;
class NewKeith 
{
	public static void main(String [] args)
	{	
		for(int i = 11;i<2000;i++)
		{
			if(isKeith(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isKeith(int num)
	{
		int cnt=0;
		for(int i = num;i>0;i/=10)
		{
			cnt++;
		}
		int[] arr = new int[cnt];
		int j=0;
		for(int i = num;i>0;i/=10)
		{
			arr[j++]=i%10;
		}
		int r = cnt-1;
		while(true)
		{
			int temp = 0;
			for(int i = 0;i<cnt;i++)
			{
				temp+=arr[i];
				// System.out.print(arr[i]+" ");
			}
			// System.out.println("======"+temp);
			if(temp==num)
			{
				return true;
			}
			else if(temp>num)
				return false;
			else{
				if(r<0)
				{
					r=cnt-1;
				}
				arr[r--]=temp;
			}
		}
	}

}