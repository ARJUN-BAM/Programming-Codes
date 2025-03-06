import java.util.*;
class Fastinating 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int k =1;k<=1000;k++)
		{
			//String s = "";
			int num = k;
			// for(int i = 1;i<=3;i++)
			// {
			// 		int t = num*i;
			// 		s+=t;
					
			// }
			// String[] arr = s.split("");
			// String cs = arr[0];
			boolean flag = true;

			// Arrays.sort(arr);
			// if(arr.contains("0")||arr.length!=9)
			// 	{System.out.println(num+" is Not a Fasinating Number.");
			// 	System.exit(0);}

			// for(int i=0;i<arr.length;i++)
			// {
			// 	System.out.println(cs+" : "+arr[i]+"    ");
			// 	if(cs.equals(arr[i]))
			// 	{
			// 		flag = false;
			// 		break;
			// 	}
			// 	else
			// 	{
			// 		cs = arr[i];
			// 	}
			// }
			// System.out.println();

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

			int temp = num;
			for(int i = 2;i<=3;i++)
			{
				num = (num*1000) + (temp*i);
				
			}				
			for(int j=0;j<=9;j++)
			{
				int cnt=0;
				for(int i = num;i>0;i/=10)
				{
					if(i%10==j)
						cnt++;
				}
				if(cnt==1){
					continue;
				}
				else{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println(temp+" ");
			
		}

	}
}

