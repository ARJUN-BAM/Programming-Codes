import java.util.Scanner;
class Pattern4 
{
	public static void main(String [] args)
	{

		int num = 5;
		for(int i = 0; i < num ; i++)
		{
			for (int j=0;j<=i ;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		for(int i = 0; i < num ; i++)
		{
			int a = 1;
			for (int j=0;j<=i ;j++ ) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
		System.out.println();
		int n =1;
		for(int i = 0; i < num ; i++)
		{
			
			for (int j=0;j<=i ;j++ ) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i = 0; i < num ; i++)
		{
			char ch = 'a';
			
			for (int j=0;j<=i ;j++ ) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}

		System.out.println();
		char ch = 'a';
		for(int i = 0; i < num ; i++)
		{
		
			for (int j=0;j<=i ;j++ ) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}

		System.out.println();

		for(int i = 0; i < num ; i++)
		{
			
			for (int j=0;j<=i ;j++ ) {
				if((i+j)%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}

		System.out.println();
		int p = 2;
		for(int i = 0; i < num ; i++)
		{
			for (int j=0;j<=i ;j++ ) {
				System.out.print(p+" ");
				p+=2;
			}
			
			System.out.println();
		}

		System.out.println();
		int m = 1;
		for(int i = 0; i < num ; i++)
		{
			for (int j=0;j<=i ;j++ ) {
				System.out.print(m+" ");
				m+=2;
			}
			
			System.out.println();
		}

		System.out.println();
		int l = 1;
		char z = 'a';
		for(int i = 0; i < num ; i++)
		{
			for (int j=0;j<=i ;j++ ) {
				if(i%2==1)
					System.out.print(l++ + " ");
				else
					System.out.print(z++ + " ");
			}
			System.out.println();
		}

		System.out.println();
		for(int i = 0;i<num;i++)
		{
			for(int j= 0;j<num-i;j++)
				System.out.print("* ");
			for(int j= 0;j<=i;j++)
				System.out.print("  ");
			System.out.println();
		}
			System.out.println();

		for(int i = 0;i<num;i++)
		{
			for(int j= 0;j<num-i;j++)
				System.out.print(" ");
			for(int j= 0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();

		for(int i = num-1;i>=0;i--)
		{
			for(int j= 0;j<num-i;j++)
				System.out.print(" ");
			for(int j= 0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
		for(int i = 3;i>=0;i--)
		{
			for(int j= 0;j<3-i;j++)
				System.out.print("* ");
			for(int j= 0;j<=i;j++)
				System.out.print("  ");
			System.out.println();
		}
		for(int i = 0;i<=3;i++)
		{
			for(int j= 0;j<4-i;j++)
				System.out.print("* ");
			for(int j= 0;j<=i;j++)
				System.out.print("  ");
			System.out.println();
		}
	}
}
