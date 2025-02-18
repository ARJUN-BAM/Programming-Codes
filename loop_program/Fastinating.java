import java.util.*;
class Fastinating 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//for(int k =1;k<=1000;k++)
		//{
			String s = "";
			int num = 327;
			for(int i = 1;i<=3;i++)
			{
					int t = num*i;
					s+=t;
					
			}
			String[] arr = s.split("");
			String cs = arr[0];
			boolean flag = true;

			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
				if(cs!=arr[i])
				{
					cs = arr[i];
				}
				else
				{
					flag = false;
					break;
				}
			}
			System.out.println();

			//This is another method
		/*
			boolean flag = true;
			for(int i = 1;i<=3;i++)
			{
					int t = num*i;
					s+=t;
					
			}
			for(char c = '1';c<='9';c++)
			{
				int cnt = 0;
				for(int j = 0;j<s.length();j++)
				{
					if(s.charAt(j)==c)
						cnt++;
				}
				if(cnt!=1)
				{
					flag = false;
					break;
				}
			}
		*/
			if(flag)
				System.out.print(num+" is a Fasinating Number.");
			else
				System.out.println(num+" is Not a Fasinating Number.");
			

	}
}

