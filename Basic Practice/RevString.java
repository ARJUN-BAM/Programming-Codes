import java.util.Scanner;
class RevString 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String s = sc.next();
		char[] arr = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		while(end>start)
		{
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
		System.out.print(arr);
	}
}