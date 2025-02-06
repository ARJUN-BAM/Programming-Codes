import java.util.Scanner;
class AreaCircle
{
	public static void main(String[] args)
	{
		System.out.print("Enter the redius of circle[in cm]: ");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		final float pi = 22/7f;
		float area = pi*r*r;
		System.out.print("The area of circle is " + area + " cm^2");
		
	}
}