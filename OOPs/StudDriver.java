
class StudDriver 
{
	static {
		System.out.println("StudDriver Static Block Start");
		System.out.println("StudDriver Static Block End");
	}
	public static void main(String [] args)
	{
		System.out.println("StudDriver Main method Start");
		Stud obj = new Stud();
		obj.displayStud();
		System.out.println("StudDriver Main method End");

	}
}