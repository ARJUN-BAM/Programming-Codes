import java.util.*;
class Keith 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int len=0;
		int temp = num;
		for(int i= num;i>0;i/=10)
			len++;
		int [] arr = new int[len];
		for(int i = len-1;i>=0;i--)
		{
			int rem = num%10;
			arr[i]=rem;
			num/=10;
		}
			System.out.println(Arrays.toString(arr));

		int sum = 0;
		int index = 0;
		for(;;)
		{
			System.out.println(Arrays.toString(arr));
			for(int i=0;i<len;i++)
			{
				sum+=arr[i];
			}
			if(sum==temp)
				{System.out.print("Keith");
									System.exit(0);	}
			else if(sum>temp)
			{
				System.out.print("Not Keith");
				System.exit(0);
			}
			else{
				arr[index]=sum;
				if(index==len-1)
					index=0;
				else{
					index++;
				}
				sum=0;
			}
		}
		
	}
}

