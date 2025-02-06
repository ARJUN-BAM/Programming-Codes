import java.util.Scanner;
class Conditional
{
	public static void main(String[] args)
	{
		boolean a = new Scanner(System.in).nextInt() > new Scanner(System.in).nextInt()?true:false;
		System.out.println(a);
		System.out.println(20>22?"20 is greater.":"23 is greater.");
	}
}