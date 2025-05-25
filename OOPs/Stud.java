class Stud 
{
	String name;
	int rollno;
	int age;
	String address;
	static {
		System.out.println("Stud Static Block Start");
		System.out.println("Stud Static Block End");
	}
	{
		System.out.println("Non Static Block Start");
		name = "Arjun Bam";
		rollno = 210139;
		age = 21;
		address = "KarveNavar, Pune";
		System.out.println("Non Static Block End");

	}
	Stud()
	{
		System.out.println("Constructor Stud");
	}
	public void displayStud()
	{
		System.out.println("DisplayStud start");
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(age);
		System.out.println(address);
		System.out.println("DisplayStud End");

	}
}