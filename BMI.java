import java.util.Scanner;
class BMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your body weight[pounds]: ");
		float weight = sc.nextFloat();
		System.out.print("Enter your body height[inches]: ");
		float height = sc.nextFloat();
		weight = weight*0.45359237f;
		height *= 0.0254f;
		float bmIndex = weight/(height*height);
		System.out.println("Weight : "+weight + " Kilogram"+" & Height : "+height+" meters."+" The BMI is "+bmIndex+" Which is in" + ((bmIndex<18.5)?(" UnderWeight"):( (bmIndex<24.5)?(" MidWeight"):( " PerfectWeight" )))+" Grade");
	}
}