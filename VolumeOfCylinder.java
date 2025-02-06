import java.util.Scanner;
class VolumeOfCylinder
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the redius and length of the Cylinder: ");
		float redius = sc.nextFloat();
		float length = sc.nextFloat();
		final float pi = 22/7f;
		float area = pi*redius*redius;
		float volume = area*length;
		System.out.println("The area and volume of the cylinder are "+ area + "cm^2 and "+volume + "cm^3");
	}
}