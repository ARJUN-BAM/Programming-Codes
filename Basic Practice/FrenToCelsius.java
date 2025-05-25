import java.util.Scanner;
class FrenToCelsius
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in celsius: ");
		double celsius = sc.nextDouble();
		double fren = (9/5d)*celsius+32;
		System.out.println(celsius + " degree celsius is "+ fren + " degree in fahrenheit");
	}
}