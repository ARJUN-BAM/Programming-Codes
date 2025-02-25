import java.util.Scanner;
class Pattern11 
{
	public static void main(String [] args)
	{
		System.out.print("Enter a Number : ");
		int n = new Scanner(System.in).nextInt();
		int temp=1,a=0,b=0;
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++){
			if(i>(n/2))
	            a=n-i-1;
	        else
	            a=i;
	        if(j>(n/2))
	            b=n-j-1;
	        else
	            b=j;
	        a=a<b?a:b;
	        System.out.print(((n/2)-a+1)+" ");
		}
			System.out.println();
		}

	}
}



/*

11111
12221
12321
12221
11111

*/