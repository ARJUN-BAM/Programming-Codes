import java.util.Scanner;
class ThreadC 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String s = sc.next();
		char[] arr = s.toCharArray();
		String rev = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev += arr[i];
		}
		System.out.println(rev);
	}
}