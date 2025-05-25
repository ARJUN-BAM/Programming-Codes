import java.util.Scanner;
class AreaOfRectangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width of the room : ");
		float width = sc.nextFloat();
		System.out.print("Enter height of the room : ");
		float height = sc.nextFloat();
		sc.close();
		float area = width*height;
		float perameter = 2*(width + height);
		System.out.println("The area & perameter of the room are "+ area + " m^2 and " + 		perameter + " m.");
	}
}