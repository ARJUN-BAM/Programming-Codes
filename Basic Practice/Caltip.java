import java.util.Scanner;
class Caltip
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter subtotal: ");
		float subtotal = sc.nextFloat();
		System.out.print("Enter Gratuity Rate: ");
		float rate = sc.nextFloat();
		float tip = ((rate/100f)*subtotal);
		float total = subtotal + tip;
		System.out.println("Tip is "+ tip +" & Total : "+ total);
	}
}