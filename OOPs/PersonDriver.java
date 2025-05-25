
class PersonDriver 
{
	public static void main(String [] args)
	{
		Person p = new Person();
		p.walk();
		System.out.println("----------------------------------");
		Person p1 = new Person("Lokesh",20,177.0f,50);
		p1.talk();
	}
}